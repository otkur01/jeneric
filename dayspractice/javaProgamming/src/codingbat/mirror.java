package codingbat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class mirror {
    public static void mirror(Stack<Integer>s) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer>s1 = new Stack<>();
        s1.addAll(s);
        while (!s1.isEmpty()) {
            int m = s1.pop();
            q.add(m);

        }


        while (!q.isEmpty()) {
            s.push(q.remove());
        }
//        while (!s.isEmpty()) {
//            q.add(s.pop());
//        }
//        while (!q.isEmpty()) {
//            s.push(q.remove());
//        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.addAll(Arrays.asList(20, 20, 17, 11, 8, 8, 9, 2));

        mirror(s);
    }


}
