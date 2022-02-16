package edi_first;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		//zadatak 1 edi
		
		Scanner scan_one = new Scanner(System.in);
			System.out.println("Enter first number: ");
			int no1 = scan_one.nextInt();
			System.out.println("Enter second number: ");
			int no2 = scan_one.nextInt();
			
			
			while(no1 == no2) {
				System.out.println("They are the same!");
				if (no1 == no2) break;
			}
			
			while(no1 > no2) {
				System.out.println("First number is greater!");
				int diff = no1 - no2;
				if (no1 > no2)
					System.out.println("Difference is: " + diff);
				break;
			}
			
			while(no1 < no2) {
				System.out.println("Second number is greater!");
				int diff = no2 - no1;
				if (no1< no2)
					System.out.println("Difference is: " + diff);
				break;
			}
	}
}
