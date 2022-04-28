package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HashMapSync {
    public static void main(String[] args){
        Map<String,String > map1 = new HashMap<>();
        Collections.synchronizedMap(map1);

        ConcurrentMap<String , String > syncMap = new ConcurrentHashMap<>();// multiple segment.
        syncMap.put("Test","test");

        System.out.println(syncMap.get("Test"));

    }
}
