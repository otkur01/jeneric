package codingbat;

import java.util.Scanner;

public class MiliSecends {
    public static void main(String[] args) {
        System.out.println("please enter the MiliSeconds : ");
        Scanner scan  = new Scanner(System.in);
        int num = scan.nextInt();
        int hours =0;
        int minutes =0;
        int secondes =0;
        int milisecondes = num;
         if(milisecondes>=1000){
             secondes=milisecondes/1000;
             milisecondes = milisecondes -secondes*1000;
         }
        if(secondes>=60){
            minutes = secondes/60;
            secondes = secondes - 60*minutes;
        }
        if(minutes>=60){
            hours = minutes/60;
            minutes =minutes- 60*hours;

        }

        System.out.println(" miliSeconds "+ milisecondes+ " seconds "+ secondes+ " munitus "+ minutes+ " hours "+ hours);

    }
}
