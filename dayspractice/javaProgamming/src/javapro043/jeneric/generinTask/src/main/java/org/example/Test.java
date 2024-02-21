package org.example;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new Oddpridicate());
        System.out.println("Number of odd integers = " + count);


    }
  public static <T> int countIf(List<T>list, UnaryPredicate<T> p){
      int count =0;
      for (T t : list) {
          if(p.test(t))count++;
      }
   return count;
  }
}
