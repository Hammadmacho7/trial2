package com.company;

public class Main {
    public static int multiplication( int num1, int num2){
        int mul = num1 * num2;
        return mul;
    }

    public static int summation(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static int subtraction(int num1, int num2){
        int sub = num1 - num2;
        return sub;
    }

    public static int division(int num1, int num2){
        int div = num1 / num2;
        return div;
    }



    public static void main(String[] args) {
	// write your code here

        int num1 = 4;
        int num2 = 8;

        System.out.println( "multiplication " + multiplication(num1, num2));
        System.out.println(" addition: " + summation(num1, num2));
        System.out.println(" subtraction: " + subtraction( num1, num2));
    }
}
