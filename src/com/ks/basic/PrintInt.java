package com.ks.basic;
import java.util.Scanner;
public class PrintInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First NUm");
        float num1 = sc.nextFloat();
        System.out.println("enter second num");
        float num2 = sc.nextFloat();
        float multiply = num1*num2;
        System.out.println("your enterd num :"+multiply);
    }
}
