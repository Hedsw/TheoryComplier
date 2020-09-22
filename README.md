# TheoryComplier

Using Java Regular Expression classes (presented in java.util.regex package), write a simple program to
validate an input email address. The domain part of the email address can be either “umassd.edu” or
“gmail.com”, and the local part (i.e., the user name) must start with a letter ([a-zA-Z]) and may be
followed by any word characters ([a-zA-Z_0-9]). The length of the local part must be larger than 5 and
less than 10. The email address is not case sensitive. In your program, you must implement the following

four methods: 

boolean validateEmailAddress(String emailAddress)

String getLocalPart(String emailAddress)

boolean isUmassdAccount(String emailAddress)

boolean isGmailAccount(String emailAddress)

Include a few test cases in the main method to verify that your implementation for each of the methods

satisfies the above requirements.
