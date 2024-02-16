package codingbat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class collapse {
    public static void collapse(Stack<Integer> s) {

        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 0; i < s.size()-1; i++) {
            int n = s.get(i);
            s.remove(i);
            int m = s.get(i+1);
           s.remove(i+1);
            q.add(n+m);
            i++;
        }
        System.out.println(q);
       /*while (!s.isEmpty()) {
            int n = s.pop();
            int m = s.pop();
            q.add(n+m);

            System.out.println(q);
        }*/
        System.out.println("++++++++++++++++++++++");
        while (!q.isEmpty()) {
            s.push(q.remove());
            System.out.println(s);
        }
        System.out.println("++++++++++++++++++++++");
        while (!s.isEmpty()) {
            q.add(s.pop());
            System.out.println(q);
        }
        System.out.println("++++++++++++++++++++++");
        while (!q.isEmpty()) {
            s.push(q.remove());
            System.out.println(s);
        }
        System.out.println(s);
    }
    public static void collapse1(Stack<Integer> s) {

        Queue<Integer> q = new LinkedList<Integer>();

        if (s.size() % 2 != 0) {
            q.add(s.pop());
        }

        while (!s.isEmpty()) {
            q.add(s.pop() + s.pop());
        }
        System.out.println(q);
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        System.out.println(s);
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println(q);
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        System.out.println(s);
    }

    public static void main(String[] args) {

        Stack<Integer>s1 = new Stack<>();
        s1.addAll(Arrays.asList(3, 7, 1, 14, 9,10));
       // collapse(s1);
         collapse1(s1);

    }

}
