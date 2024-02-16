package codingbat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class mirrorHalves {
    public static void mirrorHalves(Queue<Integer>q){
        Stack<Integer>s = new Stack<>();
        Stack<Integer>s1 = new Stack<>();
        int len = q.size();
        if(len%2!=0 || q==null){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < len/2; i++) {
         s.push(q.remove());
        }
        s1.addAll(s);
       while (!s1.isEmpty()){
           int m = s1.pop();
            s.push(m);
        }

        System.out.println(s);

       s1.addAll(q);
       while (!s1.isEmpty()){
           q.add(s1.pop());
       }

        System.out.println(q);
        while (!s.isEmpty()){
            q.add(s.pop());
           
        }
        for (int i = 0; i < len; i++) {
           q.add(q.remove());
        }
        System.out.println(q);

    }

    public static void main(String[] args) {
        Queue<Integer>q =new LinkedList<>();
        q.addAll(Arrays.asList(10, 50, 19, 54, 30, 67));
        mirrorHalves(q);
    }
}
