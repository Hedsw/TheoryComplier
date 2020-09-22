// package cis560;
import java.util.*;
import java.util.regex.*;
import java.util.Scanner;

public class regularExpression {
	// Input: User Input Email 
	// output: validation check for local part and domain part
	public static boolean validateEmailAddress(String emailAddress) {
		Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]{5,10}+@[a-zA-Z0-9.-]+$");
		Matcher matcher = pattern.matcher(emailAddress);
		return matcher.matches(); // Return True or False
	}
	// Input: User Input Email 
	// output: LocalPart ex) Let, input : kannsky@gmail.com / output : kannsky
	public static String getLocalPart(String emailAddress) {
		Pattern pattern = Pattern.compile("@");
		String[] localEmailID = pattern.split(emailAddress);
		// Let emailAddress is kannskycar@gmail.com 
		// localEmailID[0] is kannskycar is localEmailID[0] and localEmailID[1] is gmail.com 
		// System.out.println("Local Part -> " + localEmailID[0]);
		System.out.println("company Domain is -> " + localEmailID[1]);

		if(isUmassdAccount(localEmailID[1]))
			System.out.println("This is Umassd Email");
		else if(isGmailAccount(localEmailID[1]))
			System.out.println("This is Google Email");
		else 
			System.out.println("This is not Umassd and Google Email");
		return localEmailID[0];
	}
	// Input: User Input Email 
	// output: True or False // Check Umass Email
	public static boolean isUmassdAccount(String emailAddress) {
		Pattern pattern = Pattern.compile("umassd.edu");
		Matcher matcher = pattern.matcher(emailAddress);
		//System.out.println("isUmassdAccount ->  " + matcher.matches());
		return matcher.matches(); // Return True or False
	}
	// Input: User Input Email 
	// output: True or False // Check google Email
	public static boolean isGmailAccount(String emailAddress) {
		Pattern pattern = Pattern.compile("gmail.com");
		Matcher matcher = pattern.matcher(emailAddress);
		//System.out.println("isGmailAccount ->  " + matcher.matches());
		return matcher.matches(); // Return True or False
	}
   	 public static void main(String[] args) {  
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Email Please: ");
		String clientEmail = scanner.next();
		String localpart = getLocalPart(clientEmail);
		if(validateEmailAddress(clientEmail) == false) { // Email Invalid
			System.out.println("Local part is -> " + localpart);
			System.out.println("BUT Email is not valid");
		} else { // Email Valid
			System.out.println("Local part is -> " + localpart);
		}
	} // end of main 
} // end of class


// specify 