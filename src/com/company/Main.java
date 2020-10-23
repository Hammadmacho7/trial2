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

    public static void main(String[] args) {
	// write your code here

        int num1 = 4;
        int num2 = 8;

        System.out.println( "multiplication " + multiplication(num1, num2));

    }
}
