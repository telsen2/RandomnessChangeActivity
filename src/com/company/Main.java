
package com.company;

import java.util.Random;

public class Main {
    //public class RandomGenerator{

    public static void main(String[] args)
    {
        System.out.println("Generates a random integer between 5 and 95");
        Random rnd = new Random();

        //for (int i = 1; i <= 5; ++i)
        //{
            int randomInt;
            int upperbound = 95;
            int lowerbound = 5;
            randomInt = rnd.nextInt(upperbound-lowerbound) + lowerbound;
            System.out.println("Generated number: " + randomInt);
        //}

        System.out.println("Done ");
    }

    private static void output(String aMessage)

    {
        System.out.println(aMessage);
    }
}