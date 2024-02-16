package codingbat;

import java.util.*;

public class isStored {
    public static boolean isStrored(Stack<Integer>s){
        Queue<Integer>q =new LinkedList<>();
        boolean is = true;
        while (!s.isEmpty()){
            int m = s.pop();
            q.add(m);
            if(!s.isEmpty() && s.peek()<m)is = false;
        }


        while(!q.isEmpty()){
            s.push(q.remove());
        }
       while (!s.isEmpty()){
           q.add(s.pop());
       }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
     return is;

    }

    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.addAll(Arrays.asList(20, 20, 17, 11, 8, 8, 9, 2));

        System.out.println(isStrored(s));
    }

}
