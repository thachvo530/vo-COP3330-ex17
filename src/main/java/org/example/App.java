/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000000");

        System.out.print("Enter a 1 if you are a male or a 2 if you are female: ");
        int gender = scan.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        int consumed = scan.nextInt();

        System.out.print("What is your weight, in pounds? ");
        int weight = scan.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        int hours = scan.nextInt();

        if (gender == 1 ) {

           double r = 0.73;
           double BAC = (consumed * 5.14 / weight * r) - 0.015 * hours;
           System.out.print("Your BAC is "+df.format(BAC)+".");
           if (BAC <= .08) {

               System.out.print("\nIt is legal for you to drive.");

           }

           else {

               System.out.print("\nIt is not legal for you to drive.");

           }

        }

        if (gender == 2) {

           double r = 0.66;
           double BAC = (consumed * 5.14 / weight * r) - 0.015 * hours;
            System.out.print("Your BAC is "+df.format(BAC)+".");
            if (BAC <= .08) {

                System.out.print("\nIt is legal for you to drive.");

            }

            else {

                System.out.print("\nIt is not legal for you to drive.");

            }
        }

    }

}
