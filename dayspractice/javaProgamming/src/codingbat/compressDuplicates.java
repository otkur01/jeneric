package codingbat;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class compressDuplicates {
    public static void compressDuplicates(Stack<Integer>s){
        Queue<Integer>q =new LinkedList<>();
        int ontop = s.pop();
        int count = 1;

        while(!s.isEmpty()) {
            int n = s.pop();

            if(n == ontop) {
                count++;
            } else {
                q.add(ontop);
                q.add(count);
                count = 1;
                ontop = n;
            }
        }

        q.add(ontop);
        q.add(count);

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while (!s.isEmpty()){
            q.add(s.pop());
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        System.out.println(s);

    }

    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.addAll(Arrays.asList(2, 2, 2, 2, 2, -5, -5, 3, 3, 3, 3, 4, 4, 1, 0, 17, 17));
        compressDuplicates(s);
    }

}
