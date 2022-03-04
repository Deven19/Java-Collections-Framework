package TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapBasic {
    public static void main(String[] args){
        //Sorted always
        TreeMap<String,String > treeMap1 = new TreeMap<>();
        treeMap1.put("A","a");
        treeMap1.put("C","b");
        treeMap1.put("B","D");

        System.out.println(treeMap1);

        treeMap1.forEach((k,v   ) -> System.out.println(k + "  - " + v));
        Set<String > set1 = treeMap1.headMap("B").keySet();
        System.out.println((set1));

        Set<String > set2 = treeMap1.tailMap("B").keySet();
        System.out.println((set2));

    }
}
