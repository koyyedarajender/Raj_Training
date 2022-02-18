package com.org.project.practiesPackage;

import java.util.Scanner;

public class OddEven {
    public static void main(String args[]) {
        //variable initialization
        int number;
        //Run time number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        number = sc.nextInt();
        //for (number = 0; number < 5; number++) {
            //System.out.println(number);
        //}


        if (number%2==0)
        {
            System.out.println("\n You have entered EVEN Number");
            //System.out.println("odd number");
        }
            else{
            System.out.println("\n You have entered odd Number");


            }

        }


    }

