/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;

import java.lang.Math;

public class Exercise09 {
    public static void main(String[] args) {
        //create Scanner
        Scanner in = new Scanner(System.in);
        //one gallon equals 350 square feet
        double area_per_gallon = 350;
        //prompt the user for both the length of width of the ceiling
        System.out.print("What is the length of the ceiling? ");
        int length = in.nextInt();
        System.out.print("What is the width of the ceiling? ");
        int width = in.nextInt();
        //calculate the area
        int area = length * width;
        //calculate the number of gallons the user needs to paint their ceiling
        double num_of_gallons = area / area_per_gallon;
        //round the number of gallons to the nearest whole number using the Math.ceil() function
        double round = Math.ceil(num_of_gallons);
        //now tell the user how many gallons they need to paint their ceiling
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet.", round, area);
    }
}
