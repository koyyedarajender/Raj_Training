package com.org.project.practiesPackage;

import java.util.Scanner;

public class SingleElementArray {
    public static void main(String[] args) {

        //initialization
        //int n=5;
        //for (int i = 0; i < n; i++) {

            // Create an object of Scanner class for run time console value
            Scanner sc = new Scanner(System.in);

            // Ask in how many subjects have you given exams.
            System.out.println("In how many subject have you given exams?");
            int n = sc.nextInt();

// Create one-dimensional array with size n.
            //int[]marks1 = new int[n];
            //print the marks

            System.out.println("Enter your marks");
            int[] marks1 = new int[n];
            for (int i = 0; i < n; i++) {
                marks1[i] = sc.nextInt();

            }
            //check total marks
            int total = 0;
            for (int i = 0; i < n; i++) {
                total = total + marks1[i];

            }

            System.out.println("Total marks: " + total);
            // int total=0;
            float percentage = (float) total / n;
            System.out.println("percentage: " + percentage + "%");


        }


    }
//}
