package HashMap;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.*;

public class HashMapBasic {
    public static void main(String[] args){
        HashMap<String,String> hmap = new HashMap<String, String>();
        hmap.put("a", "A");
        hmap.put("b", "B");
        hmap.put("c", "C");
        hmap.put("d", null);
        hmap.put("e", null);
        hmap.put(null, null);
        hmap.put(null, "sd");
        hmap.remove("c");


        System.out.println(hmap);
        System.out.println(hmap.get("a"));

        Iterator<String> it_hmap = hmap.keySet().iterator();
        while(it_hmap.hasNext()){
//            System.out.println(it_hmap.next());
            String key = it_hmap.next();
            System.out.println("Key : " + key+ " -> Value : " +hmap.get(key));
        }

        System.out.println("------------------over the pair");
        Iterator<Entry<String,String >> it2_hmap = hmap.entrySet().iterator();
        while(it2_hmap.hasNext()){
            Entry<String,String> entry = it2_hmap.next();
            System.out.println("Key : " + entry.getKey() + " -> value : "+ entry.getValue());
        }

        System.out.println("------------------Java 8");
        hmap.forEach((k,v)->{
            System.out.println(k + " -> " + v);
        });

    }
}
