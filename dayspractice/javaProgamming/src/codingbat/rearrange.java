package codingbat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class rearrange {
    public static void rearrange(Queue<Integer> q){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();



        while (!q.isEmpty()){
            int n = q.remove();
            if(n%2==0){
                s1.add(n);
            }
            else {
                s2.add(n);
            }
        }
      q.addAll(s1);
        q.addAll(s2);

        System.out.println(q);



    }

    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.addAll(Arrays.asList(3, 7, 1, 14, 9,10));
        rearrange(q);
    }

}
