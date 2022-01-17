package com.company;

import java.util.Scanner;
import java.util.Random;

 class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);
        Random rand = new Random();


        int upperbound = 21;
        int int_random =rand.nextInt(upperbound);


        System.out.println("Hello! What is your name?");

        var input = myObj.next();


        //Figure out how to carry over user input into the below statement:


        //Find a way for you program to select a random integer.
        //Then  check to see if user's guess matches the random number that is generated.

        //var guess = myObj.next();

        System.out.println("Well then  " + input +  ", I'm thinking of a number between 1 and 20. Take a guess!");


        //if (numGuess < int_random){
            //System.out.println("Your guess is too low. Take another guess.");
        //}else if (numGuess > int_random){
            //System.out.println("Your guess is too high. Take another guess");
        //} else

        int maxTrials = 7;
        int i;


       for (i = 0; i < maxTrials; i++) {

           int numGuess = myObj.nextInt();
           if (numGuess == int_random) {
               //System.out.println("Your guess is too low. Take another guess.");
               System.out.println("Great job, you guessed the number in " + i + " attempts");
               break;
           } else if (numGuess < int_random && i != maxTrials-1) {
               //
               System.out.println("Your guess is too low. Take another guess.");

           } else if (numGuess > int_random && i != maxTrials-1) {
               System.out.println("Your guess is too high. Take another guess");
           }
       }
           if (i == 7) {
               System.out.println("You have exceeded the allowed amount of attempts. Would you like to play again? Enter Y or N ");
           }
       }}








