package com.ashwini;
import java.util.regex.Matcher;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(usernameValidation(s.nextLine()));

		
	}

	public static String usernameValidation(String str) {
		// TODO Auto-generated method stub
		 Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
	        Matcher matcher = p.matcher(str);
	        return matcher.matches() ? "true" : "false";
	}

}
