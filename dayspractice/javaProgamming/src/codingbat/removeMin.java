package codingbat;

import java.util.*;

public class removeMin {
    public static int removeMin(Stack<Integer>s){
        Queue<Integer>q = new LinkedList<>();
        int min = Collections.min(s);
        s.removeIf(p->p==min);
        return min;



    }

    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.addAll(Arrays.asList(2, 8, 3, 19, 7, 3, 2, 3, 2, 7, 12, -8, 4));
        System.out.println(removeMin(s));

    }
}
