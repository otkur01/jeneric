package codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeEvenlength {
    public static void main(String[] args) {
        List<String>str = new ArrayList<>(Arrays.asList("This", "is", "a", "test"));
        for (String s : str) {
            if(s.length()%2==0){
                str.remove(s);
            }
        }
        System.out.println(str);
    }


}
