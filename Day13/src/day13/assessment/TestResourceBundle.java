/**
 * 
 */
package day13.assessment;

import java.util.ResourceBundle;

/**
 * 
 */
public class TestResourceBundle {
	public static void main(String args[]) {
		ResourceBundle rb = ResourceBundle.getBundle("message");

		String URL = rb.getString("url");
		String USER = rb.getString("user");
		String PASSWORD = rb.getString("password");

		System.out.println("URL: " + URL);
		System.out.println("USER: " + USER);
		System.out.println("PASSWORD: " + PASSWORD);
	}
}
