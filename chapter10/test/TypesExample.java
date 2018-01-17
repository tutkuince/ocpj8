package com.oracle.javacert.professional.chapter10.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Blob;
//import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TypesExample {
	private static Connection conn;
	private static Statement stmt;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	private static String query1 = "Select * from BOOKS";
	private static String query2 = "Update books set coverpicture = ? where isbn = ?";
	private static String query3 = "Select title, coverpicture from books where isbn = ?";
	
	public static void main(String[] args) {
		//retrieveBooks();
		
		
		//addPictureToBook("978-0132761697", "src\\com\\oracle\\javacert\\professional\\chapter10\\test\\book\\slider-3.jpg");
		retrieveBookCoverPicture("978-0132761697");
	}
	
	
	public static void retrieveBooks() {

		
		conn = JDBCUtil.getConnection();
		
		try {
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(query1);
			
			while(rs.next()) {
				String isbn = rs.getString("isbn");
				String title = rs.getString("title");
				Date publishDate = rs.getDate("publishdate");
				int edition = rs.getInt("edition");
				String publisherName = rs.getString("publishername");
				//Clob desc = rs.getClob("description");
				String desc = rs.getString("description");
				boolean stock = rs.getBoolean("stock");
				Blob coverpicture = rs.getBlob("coverpicture");
				
				System.out.println("ISBN: " + isbn);
				System.out.println("Title: " + title);
				System.out.println("Publish Date: " + publishDate);
				System.out.println("Edition: " + edition);
				System.out.println("Publisher Name: " + publisherName);
				System.out.println("Description: " + desc);
				System.out.println("In stock: " + (stock ? "Yes" : "No"));
				System.out.println("Cover Picture: " + coverpicture);
				System.out.println("-------------------------");
			}
			
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void addPictureToBook(String isbn, String path) {
		conn = JDBCUtil.getConnection();
		
		try {
			pstmt = conn.prepareStatement(query2);
			
			Blob coverPicBlob = conn.createBlob();
			ImageIcon icon = new ImageIcon(path);
			ObjectOutputStream oos = new ObjectOutputStream(coverPicBlob.setBinaryStream(1));
			oos.writeObject(icon);
			oos.close();
			
			pstmt.setBlob(1, coverPicBlob);
			pstmt.setString(2, isbn);
			
			pstmt.execute();
			
			conn.close();
			pstmt.close();
			
			System.out.println("1 row(s) effected");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void retrieveBookCoverPicture(String isbn) {
		conn = JDBCUtil.getConnection();
		
		try {
			pstmt = conn.prepareStatement(query3);
			pstmt.setString(1, isbn);
			boolean result = pstmt.execute();
			
			if (result) {
				ResultSet rs = pstmt.getResultSet();
				
				while(rs.next()) {
					String title = rs.getString("title");
					Blob coverPicBlob = rs.getBlob("coverpicture");
					
					if(coverPicBlob != null) {
						ObjectInputStream ois = new ObjectInputStream(coverPicBlob.getBinaryStream());
						ImageIcon icon = (ImageIcon) ois.readObject();
						displayCoverImage(title, icon);
					} else {
						displayCoverImage(title, null);
					}
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void displayCoverImage(String title, ImageIcon image) {
		JFrame frame = new JFrame();
		frame.setSize(900, 1000);
		frame.setLayout(new BorderLayout());
		
		JLabel label = null;
		
		if(image == null) {
			label = new JLabel("No Cover Picture Found for: " + title, JLabel.CENTER);
			label.setFont(new Font("Arial", Font.BOLD, 24));
			frame.add(label, BorderLayout.CENTER);
		} else {
			label = new JLabel("Cover Picture for: " + title, JLabel.CENTER);
			label.setFont(new Font("Arial", Font.BOLD, 24));
			label.setForeground(Color.WHITE);
			label.setBackground(Color.BLACK);
			frame.add(label, BorderLayout.CENTER);
			
			JPanel labelPanel = new JPanel();
			labelPanel.setBackground(Color.BLACK);
			labelPanel.add(label);
			frame.add(labelPanel, BorderLayout.NORTH);
			
			JPanel imagePanel = new JPanel();
			JLabel imageLabel = new JLabel(image);
			imagePanel.add(imageLabel);
			
			JScrollPane scroller = new JScrollPane(imagePanel);
			frame.add(scroller, BorderLayout.CENTER);
		}
		
		label.setOpaque(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
