package java_week_3_writing_hw;

import java.util.Arrays;

/**
 * Write a Java Program to sum values of an array.
 */
public class Programme_18_SumOfArray {

    public static void main(String[] args) {
        //Numeric array declaration
        int[] numArray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        int sum = 0;
        //calculating the sum of arrays value using for loop
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        System.out.println("Values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Sum of all the values of the array are: " + sum);
    }
}

