package scanner;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
 
         //here we are imputting a string method
         System.out.println("Welcome thank you for taking the survey");
         System.out.println("What is your name?");
         String name = scan.nextLine();

         //here we are imputting a double method
         System.out.println("How much money do you spend on coffee?");
         double coffeePrice = scan.nextDouble();
         // here we are imputting a double method
         System.out.println("How much money do you spend on food?");
         double foodPrice = scan.nextDouble();

         //Here we are imputting the int method
         System.out.println("How many times a week do you buy coffee?");
         int coffeeAmount = scan.nextInt();
         //here we are imputting a int method
         System.out.println("How many times a week do you buy food?");
         int foodAmount = scan.nextInt();

         scan.close();
    }
}
