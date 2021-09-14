/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        int people=0, slices=0;
        int pizzas=0;
        int div=0;
        int rem=0;
        System.out.print("How many people? ");
        people=sc.nextInt();
        System.out.print("How many pizzas do you have? ");
        pizzas=sc.nextInt();
        System.out.print("How many slices per pizza? ");
        slices=sc.nextInt();
        System.out.printf("%d people with %d pizzas (%d slices)\n",people, pizzas, (slices*pizzas));
        div=(slices*pizzas)/people;
        System.out.printf("Each person gets %d pieces of pizza\n", div);
        rem=(slices*pizzas)%people;
        System.out.printf("There are %d leftover pieces\n", rem);

    }
}