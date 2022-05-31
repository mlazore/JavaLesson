package scanner;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         //here we are imputting a string method
         System.out.println("Welcome thank you for taking the survey");

         int counter = 0;
         System.out.println("\nWhat is your name?");
         String name = scan.nextLine();
         counter++;

         //here we are imputting a double method
         System.out.println("\nHow much money do you spend on coffee?");
         double coffeePrice = scan.nextDouble();
         counter++;

         // here we are imputting a double method
         System.out.println("\nHow much money do you spend on food?");
         double foodPrice = scan.nextDouble();
         counter++;

         //Here we are imputting the int method
         System.out.println("\nHow many times a week do you buy coffee?");
         int coffeeAmount = scan.nextInt();
         counter++;

         //here we are imputting a int method
         System.out.println("\nHow many times a week do you buy food?");
         int foodAmount = scan.nextInt();
         counter++;

         System.out.println("\nThank you " + name + " Thank you for answering all " + counter + " questions");
         System.out.println("Your fast food expenses are " + (foodPrice/coffeePrice) + " Times more than coffee expenses");
         System.out.println("Weekly you spend $" + (coffeeAmount*coffeePrice) + " on coffee");  
         System.out.println("Weekly, you spend $" + (foodAmount*foodPrice) + " on food");
         scan.close(); // always close the scan or itll be a open data source leak
    }
}
