package com.oracle.javacert.professional.chapter06._01customexceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class MultiCatchExceptions {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("tutku.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);
			System.out.println(date);
		} catch (DateTimeParseException | IOException e) {	// multi-catch exception
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	
	// } catch (DateTimeParseException e | IOException e | Exception e) {	// DOES NOT COMPILE
	// } catch (DateTimeParseException e1 | IOException e2 | Exception e3) {	// DOES NOT COMPILE
	// } catch (DateTimeParseException | IOException | Exception e) {	// IT IS GOOD!
	// } catch (FileNotFoundException | IOException e) {	// FileNotFoundException is a subclass of IOException. It is redundant.
}
