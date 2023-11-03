package java_week_3_writing_hw;

import java.util.Scanner;

public class Programme_1_OddEvenTernaryOperator {
    /**
     * 1. write a java program that tells us that input number is odd or even/
     * HINT : use ternary operator ( ? :)
     */
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        scanner.close();
    }

    //checking the number is even or odd
    public static void isItOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The" + number + " is " + evenOrOdd + " number");
    }
}
