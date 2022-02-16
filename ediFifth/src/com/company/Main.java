package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double inputOne = input.nextInt();
        System.out.println("Enter second number : ");
        double inputTwo = input.nextInt();
        System.out.println("Enter third number : ");
        double inputThree = input.nextInt();
        System.out.println("Enter fourth number : ");
        double inputFour = input.nextInt();

        double inputAverage = ((inputOne + inputTwo + inputThree) / 3);
        double less = inputFour - inputAverage;
        double more = inputAverage - inputFour;

        if(inputAverage < inputFour)
            System.out.println("The average of first 3 numbers is " + inputAverage + ", so its less then "
            + inputFour + " by " + less);
        else if (inputAverage > inputFour)
            System.out.println("The average of first 3 numbers is " + inputAverage + ", so its more then "
                    + inputFour + " by " + more);

    }
}
