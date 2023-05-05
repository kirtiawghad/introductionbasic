package com.ks.basic;
import java.util.Scanner;
public class PrintInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First NUm");
        int num1 = sc.nextInt();
        System.out.println("enter second num");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("your enterd num :"+sum);
    }
}
