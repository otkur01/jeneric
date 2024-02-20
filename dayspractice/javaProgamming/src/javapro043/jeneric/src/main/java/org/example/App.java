package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> item = new ArrayList<>();
        item.add(1);
        item.add(2);
        item.add(3);
        item.add(4);
        //item.add("apple");

        printDuonble(item);




        System.out.println( "Hello World!" );
    }

    private static void printDuonble(ArrayList item) {
        for (Object o : item) {
            System.out.println((Integer)o);
        }
    }
}
