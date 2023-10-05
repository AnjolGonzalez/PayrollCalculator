package com.pluralsight;
import java.util.*;
public class PayrollCalculator {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("What is your name?");
    String name = scanner.nextLine();

    System.out.print("How many hours have you worked?");
    float hours = scanner.nextFloat();

    System.out.print("What is your pay rate?");
    float pay = scanner.nextFloat();
        /*
        int hour = 40;
         double payrate = 25.00;
        */
        double week = 5000.00;
    int month = 12;
    System.out.println("The gross pay would be $" + week * month);
    System.out.println("Angel Gonzalez makes $60,000 yearly");

    }

}
