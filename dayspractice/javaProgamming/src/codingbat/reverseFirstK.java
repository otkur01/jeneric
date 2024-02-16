package codingbat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstK {
    public static void reverseFirstK(int n, Queue <Integer>q){
        Stack<Integer>s = new Stack<>();
        int len = q.size();
        if(q==null || len<n){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < n; i++) {
            s.push(q.remove());
        }
       while (!s.isEmpty()){
           q.add(s.pop());
       }
        System.out.println("q = " + q);
//        while (!q.isEmpty()){
//           s.push(q.remove());
//       }
//        System.out.println("s = " + s);
       for (int i = 0; i < len - n; i++) {
          q.add(q.remove());
       }

//        System.out.println(s);
//        while (!s.isEmpty()){
//            s1.push(s.pop());
//        }
//        while (!s1.isEmpty()){
//            q.add(s1.pop());
//        }
        System.out.println("q = " + q);
    }

    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
        reverseFirstK(4,q);
    }
}
