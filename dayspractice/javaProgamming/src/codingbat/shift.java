package codingbat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class shift {
    public static void shift(Stack<Integer>s, int n){
        Queue<Integer> q = new LinkedList<>();
        int a = s.size();
        for (int i = 0; i < a-n; i++) {
            q.add(s.pop());
        }
        while (!q.isEmpty()){
            s.push(q.remove());

        }
        for (int i = 0; i < a - n; i++) {
            q.add(s.pop());
        }
        while (!s.isEmpty()){
            q.add(s.pop());
        }

        while (!q.isEmpty()){
            s.push(q.remove());
        }

//        System.out.println(s);
//        for (int i = 0; i < n; i++) {
//            q.add(s.pop());
//        }
        System.out.println(q);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Stack<Integer>s1 = new Stack<>();
        s1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(s1);
        shift(s1,6);
    }
}
