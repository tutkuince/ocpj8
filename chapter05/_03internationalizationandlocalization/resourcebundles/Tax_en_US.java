package com.oracle.javacert.professional.chapter05._03internationalizationandlocalization.resourcebundles;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Tax_en_US extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "tax", new Object() } };
	}

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("resourcebundles.Tax", Locale.US);
		System.out.println(rb.getObject("tax"));
	}
}
