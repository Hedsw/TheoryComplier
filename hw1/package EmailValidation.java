package EmailValidation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static boolean validateEmailAddress(String emailAddress) {
		Pattern pattern = Pattern.compile("^([a-zA-Z]" + "[a-zA-Z0-9]{4,9})*@" + "([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
		Matcher matcher = pattern.matcher(emailAddress);

		if (matcher == null)
			return false;
		return matcher.matches();
	}

	public static String getLocalPart(String emailAddress) {
		Pattern pattern = Pattern.compile("\\@");
		String[] words = pattern.split(emailAddress);
        // split front side -> Input -> kanncar@gmail.com  Return kanncar
	}

	public static boolean isUmassdAccount(String emailAddress) {
		Pattern pattern = Pattern.compile("umassd.edu");
		Matcher matcher = pattern.matcher(emailAddress);
		return matcher.matches();
	}

	public static boolean isGmailAccount(String emailAddress) {
		Pattern pattern = Pattern.compile("gmail.com");
		Matcher matcher = pattern.matcher(emailAddress);
		return matcher.matches();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input your email address: ");
		String email = scanner.next();
		// validate
		if (validateEmailAddress(email)) {
			System.out.println("Email information: ");
			// local part
			getLocalPart(email);
		} else
			System.out.print(email + " is not valid");
	}
}