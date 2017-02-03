package bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Application prompts user to enter an interger between 1 and 100

        System.out.println("Please enter a number between 1 and 100");
        int answer = (int) (Math.random() * 100 + 1);

        int number = 0;

        System.out.println("Enter Any Number Here");
        number = scan.nextInt();

        //Display the results based on the integer range entered

        //Use if/else statements to take different actions depending on user input

        //Given an integer entered by a user, perform the following conditional actions:

        //If the number is odd

        while (true) {
            System.out.println("What number do you want? ");
            scan.nextInt();

            if (number % 2 != 0) {
            System.out.println("Please Enter An Odd Number");
            number = scan.nextInt();

            } else if (number % 2 == 0) ;
            System.out.println("Please Enter An Even number ");
            number = scan.nextInt();{

            }

            if ((number % 2 == 0) && (number >= 2) && (number <= 25)) {
                System.out.println("Even and less than 25.");
                number = scan.nextInt();

            } else if ((number % 2 == 0) && (number >= 26) && (number >= 60)) {
                System.out.println(number + "Even");
                number = scan.nextInt();

            } else if ((number % 2 == 0) && (number >= 60)) {
                System.out.println(number + "Even");
                number = scan.nextInt();

            } else if ((number % 2 == 1) && (number >= 60)) {
                System.out.println(number + "Odd");
                number = scan.nextInt();
            }
            System.out.println("Thank you, have a nice day! ");
            number = scan.nextInt();

        }

    }
}

