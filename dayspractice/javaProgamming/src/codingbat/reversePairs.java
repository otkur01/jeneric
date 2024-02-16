package codingbat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversePairs {
    public static void switchPairs(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
         int a = s.size();
        for (int i = 0; i < a/2; i++) {
            int n = s.pop();
            int m = s.pop();
            q.add(m);
            q.add(n);


        }
        System.out.println(q);
        while (!q.isEmpty()){
            s.push(q.poll());

        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println(q);
        while (!q.isEmpty()){
            s.push(q.poll());

        }

        System.out.println("q = " + q);
        System.out.println("s = " + s);
    }

    public static void main(String[] args) {
        Stack<Integer>s1 = new Stack<>();
        s1.addAll(Arrays.asList(3, 7, 1, 14, 9,10,5));
        switchPairs(s1);
    }

}