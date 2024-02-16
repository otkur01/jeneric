package codingbat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class isConsecutive {
    public static boolean isConsecutive(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
        boolean result = true;

        int a = s.size();
        for (int i = 0; i < a-1; i++) {
            int m = s.pop();
            q.add(m);
            if(m-s.peek()!=1)return false;
        }
        while (!q.isEmpty()) {
            s.push(q.remove());

        }
        while (!s.isEmpty()) {
            q.add(s.pop());

        }
       // System.out.println(q);
        while (!q.isEmpty()) {
            s.push(q.remove());

        }
//        System.out.println(s);
//        System.out.println("+++++++++++++++++");
//       q.addAll(s);
//      //  System.out.println(q);
//       int sum = s.peek()+q.peek();
//
//        for (int i = 0; i < a; i++) {
//            if(s.peek()+q.peek()!=sum){
//                return false;
//            }
//            s.remove(s.peek());
//            q.remove(q.peek());
//        }
       return result;
    }

    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.addAll(Arrays.asList(3, 4, 5, 6, 7, 8, 7, 10));
        System.out.println(s);
        System.out.println(isConsecutive(s));
    }



}
