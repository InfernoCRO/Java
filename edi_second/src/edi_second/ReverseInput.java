package edi_second;

import java.util.Scanner;

public class ReverseInput {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter your statement: ");
	
	String normal = input.nextLine();
	
	char[] letters = new char [normal.length()];
	int letterIndex = 0;
	for(int i = normal.length() - 1; i >= 0; i--) {
		letters[letterIndex] = normal.charAt(i);
		letterIndex++;
		}
		
		String reverse = "";
		for(int i =0; i < normal.length(); i++) {
			reverse = reverse + letters[i];
		}
		
		System.out.println(reverse);
		System.out.println("Length of statement without spaces is: " + 
		reverse.replace(" ", "").length());
		
	}
	
}

