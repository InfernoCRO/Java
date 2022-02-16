package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannerOne = new Scanner(System.in);
        System.out.println("Enter a number between 10 & 20: ");
        int inputNumber = scannerOne.nextInt();

        for (int i = inputNumber; i <= 30;i++)  {
            System.out.println("This is number " + i);
            if (i == 30)
                System.out.println("...");
        }



    }
}
