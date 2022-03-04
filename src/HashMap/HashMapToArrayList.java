package HashMap;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapToArrayList {
    public static void main(String[] args) {
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("A", "a");
        hMap.put("B", "b");
        hMap.put("C", "c");

        System.out.println(hMap.size());
        Iterator it = hMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pp = (Map.Entry) it.next();
            System.out.println(pp.getKey() + "-" + pp.getValue());
        }

        // Get all key in ArrayList
        ArrayList<String> arrayList2 = new ArrayList<>(hMap.keySet());
        for (String s : arrayList2) {
            System.out.println(s);
        }

        //Get all values
        ArrayList<String> arrayList3 = new ArrayList<>(hMap.values());
        for (String s : arrayList3) {
            System.out.println(s);
        }

        hMap.forEach((k,v) -> System.out.println(k +" - "+ v));
    }
}
