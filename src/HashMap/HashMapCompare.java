package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
    public static void main(String[] args){
        HashMap<String ,String> h_map = new HashMap<String,String>();
        h_map.put("test","Test");
        h_map.put("test2","Test2");
        h_map.put("test3","Test3");

        HashMap<String ,String> h_map2 = new HashMap<String,String>();
        h_map2.put("test","Test");
        h_map2.put("test2","Test2");
        h_map2.put("test3","Test3");
        System.out.println(h_map.equals(h_map2));


        System.out.println("---------");
        HashMap<String ,String> h_map3 = new HashMap<String,String>();
        h_map3.put("test","Test");
        h_map3.put("test2","Test2");
        h_map3.put("test4","Test4");

        System.out.println(h_map2.keySet().equals(h_map3.keySet()));

        System.out.println("--------- Extra Key");
        HashSet<String> hs_m1_key = new HashSet<>(h_map.keySet());
        hs_m1_key.addAll(h_map3.keySet());
        System.out.print(hs_m1_key);

        hs_m1_key.removeAll(h_map.keySet());
        System.out.println(hs_m1_key);

        System.out.println("--------- Compare by value"); // Key can be compared directly
        System.out.println(new ArrayList<String>(h_map2.values()).equals(new ArrayList<String>(h_map.values())));
        System.out.println(new HashSet<String>(h_map2.values()).equals(new HashSet<String>(h_map.values()))); //With unique only


    }
}
