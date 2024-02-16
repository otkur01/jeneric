package codingbat;

import java.util.Collections;
import java.util.Stack;

public class maxToTop {
    public static void maxToTop(Stack<Integer>s){
        int max = Collections.max(s);
        s.removeIf(p->p==max);
        s.add(max);

    }
}
