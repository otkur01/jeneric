package codingbat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class interleave {
    public static void interleave(Queue<Integer>q){
        if(q.size()%2!=0){
            throw new IllegalArgumentException();
        }
        Stack<Integer>s = new Stack<>();
        Stack<Integer>s1 = new Stack<>();
        int len = q.size();
        for (int i = 0; i < len/2; i++) {
            s.push(q.remove());
        }
        System.out.println(s);
         while (!q.isEmpty()){
             s1.push(q.remove());
         }
        System.out.println(s1);
         while (!s.isEmpty() && !s1.isEmpty()){

             q.add(s1.pop());
             q.add(s.pop());
         }
        while (!q.isEmpty()){
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println(q);

    }

    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        interleave(q);
    }
}
