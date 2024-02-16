package codingbat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reorder {
    public static void reorder(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int a = q.size();
        int count  =0;
        for (int i = 0; i < a; i++) {
            int m = q.remove();
            if(m<0)s.push(m);
            else {
                q.add(m);
                count++;
            }
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        for (int i = 0; i < count; i++) {
            q.add(q.remove());
        }

        System.out.println(q);
    }

    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.addAll(Arrays.asList(1, 2, -2, 4, -5, 8, -8, 12, -15, 23));
         reorder(q);
    }
}
