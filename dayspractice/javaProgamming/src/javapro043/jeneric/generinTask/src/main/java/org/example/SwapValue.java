package org.example;

import java.util.Arrays;
import java.util.List;

public class SwapValue {
    public static void main(String[] args) {
        Integer []a = {1,2,3,4,5,6};
        Swap_value(a,2,4);
        System.out.println(Arrays.toString(a));
        String [] str = {"alim","hekim","salim","kamil","salih", "azad"};
        Swap_value(str,1,3);
        System.out.println(Arrays.toString(str));
    }
    public static <T> void Swap_value(T[] ts, int a, int b){
        T temp = ts[a];
        ts[a] = ts[b];
        ts[b] = temp;



    }


}
