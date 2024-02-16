package codingbat;

import java.util.Map;

public class mapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
       if(!map.get("a").isEmpty()){
           map.replace("b",map.get("a"));
           map.put("a","");
       }

       return map;


    }




}
