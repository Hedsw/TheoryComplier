package cis560;

/*
 * Refer to http://www.javacodegeeks.com/2012/11/java-regular-expression-tutorial-with-examples.html
 */
import java.util.*;
import java.util.regex.*;
import java.util.Scanner;

public class regularExpression{
	/*public boolean validateEmailAddress(String emailAddress) {
			Pattern pattern = Pattern.compile;
	}*/
	public static String getLocalPart(String emailAddress) {
		Pattern pattern = Pattern.compile("@");
		String[] localEmailID = pattern.split(emailAddress);
		// Let emailAddress is kannskycar@gmail.com 
		// localEmailID[0] is kannskycar is Local Part and localEmailID[1] is gmail.com 
		System.out.println("Local Part -> " + localEmailID[0]);
		System.out.println("Domain Check -> " + localEmailID[1]);
		return emailAddress;
	} 
	public static boolean isUmassdAccount(String emailAddress) {
		Pattern pattern = Pattern.compile("umassd.edu");
		Matcher matcher = pattern.matcher(emailAddress);
		return matcher.matches(); // Return True or False
		// We then use matches method that returns boolean result based on input String matches the regex pattern or not.
	}
	public static boolean isGmailAccount(String emailAddress) {
		Pattern pattern = Pattern.compile("gmail.com");
		Matcher matcher = pattern.matcher(emailAddress);
		return matcher.matches(); // Return True or False
	}
   	 public static void main(String[] args) {  
		//Scanner scanner = new Scanner(System.in);
		String test = "test@gmail.com";
		System.out.println("Enter a line of text: ");
		getLocalPart(test);
		isGmailAccount(test);
		isUmassdAccount(test);
	} 
}
