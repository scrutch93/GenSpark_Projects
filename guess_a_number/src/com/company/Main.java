package com.company;

import java.util.Scanner;

 class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);

        System.out.println("Hello! What is your name?");

        var input = myObj.next();

        //Figure out how to carry over user input into the below statement:
        System.out.println("Well then  " [input]  "I'm thinking of a number between 1 and 20. ");

        //Find a way for you program to select a random integer.
        //Then  check to see if user's guess matches the random number that is generated.

        var numGuess =myObj.next();

        //Create an if statement reflecting if the user's guess is too high
        //Create an if statement reflecting if the user's guess is too low


    }
}
