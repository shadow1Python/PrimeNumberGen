import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List;
import java.io.FileReader;


public class PrimeCheck{
  public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
         
         // define the universal variables
        int max = 999999999;
        int min = 1;
        int range = max - min + 1;
        double tries = 0;
        int randomlyGenerated = 0;
        double primes = 0;
        int triesInt = (int)tries;
        long startTime = System.nanoTime();

        // int primesInt = (int)primes;

        System.out.println("Stop after how many prime numbers? ");
        double numPrimes = console.nextInt();
        int numPrimesInt = (int)numPrimes;
        // generate random numbers within 1 to 10
        for (int i = 0; i < 99999999; i++) {
            int rand = (int)(Math.random() * range) + min;
  
            // Output is different everytime this code is executed
            // System.out.println("Randomly generated number: " + rand);
            randomlyGenerated = rand;
            

            if(isPrime(randomlyGenerated) == true) {
               System.out.println(randomlyGenerated + " is a prime number.");
               // System.out.println(tries + " total tries before getting a prime number");
               // System.exit(0);
               tries = tries + 1;
               primes = primes + 1;
               triesInt = (int)tries;
                       
            }
            


             if(isPrime(randomlyGenerated) == false){
                System.out.println(randomlyGenerated + " is not a prime number.");
                tries = tries + 1;
                triesInt = (int)tries;
                

            }
            
            if (numPrimes <= 0) {
               System.out.println("Hey that's not a valid number of primes!");
               System.exit(0);
            }
            
            else if (primes >= numPrimes) {
               System.out.print("It took " + triesInt + " tries to get " + numPrimesInt + " prime numbers, ");
               System.out.println("which is an average of " + (numPrimes/tries) + " primes per try");
              
            
        }
         
         //System.out.println("What number do you want to check the prime value of? ");
         //int value = console.nextInt();
          
        /*   int value = randomlyGenerated;
      for(int i = 1; i<2; i++){
         if(isPrime(value) == true) {
            System.out.println(value + " is a prime number.");
         }
         else {
            System.out.println(value + " is not a prime number.");
         } */
         
         //System.out.println(isPrime(value));
      }
  

   public static boolean isPrime(int number) {
      int count = 0;
      for (int i = 1; i <= number; i++) {
         if (number % i == 0) {
            count++;
         }
         if (count >2) {
            return false;
         }
         
      }
      return true;
      
   }
}
