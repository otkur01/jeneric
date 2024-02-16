package codingbat;

import java.util.Scanner;

public class SumOfdigits2 {
    public static void main(String[] args) {
        System.out.println("please enter the number : ");
        Scanner scan  = new Scanner(System.in);
        int num = scan.nextInt();
        String str = String.valueOf(num);
        int sum = 0;
        int j = 1;
        for (int i = str.toCharArray().length - 1; i >= 0; i--) {
            System.out.println("the "+ j+ "th digit is "+ str.charAt(i) );
            j++;
            sum += Integer.parseInt(""+str.charAt(i));
        }

        System.out.println("the sum of the digits are "+ sum);
    }

}
