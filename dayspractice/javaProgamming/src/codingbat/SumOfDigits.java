package codingbat;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("please enter the number : ");
        Scanner scan  = new Scanner(System.in);
        int num = scan.nextInt();
        int sum =0;
        int i =1;
        while(num%10!=0){
            int digit = num%10;
            num = num/10;
            sum+=digit;
            System.out.println("digit "+ i++ +  " is "+ digit);


        }
        System.out.println("the sum of the digits are "+ sum);


    }

}
