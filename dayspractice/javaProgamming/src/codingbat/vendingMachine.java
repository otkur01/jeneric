package codingbat;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        System.out.println("please enter the price : ");
        Scanner scan  = new Scanner(System.in);
        double price = scan.nextDouble();
        System.out.println("please enter the amount of paid : ");
        double paid = scan.nextDouble();
        if(paid<0 || paid<0) System.out.println("invalid input ");
        double change = paid - price;
        if(change<0) System.out.println("invalid input ");
        int change1 = (int) (change*100);
        int bills = change1/100;
        int quarters = (change1%100)/25;
        int Dimes = (change1%100)%25/10;
        int Nickels = (change1%100)%25%10/5;
        int pennies = (change1%100)%25%10%5;
        System.out.println(bills+ " dollar bills "+ quarters+ " quarters "+ Dimes+ " dimes "+ Nickels + " nickels "+ pennies+ " pennies " );

    }

}
