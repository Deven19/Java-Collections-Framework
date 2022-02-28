package HashMap;

import javax.management.ImmutableDescriptor;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialize {

    public static Map<String,String> map3;
    static {
        map3 = new HashMap<String,String>();
        map3.put("s","S");
    }
    public static void main(String[] args){

        HashMap<String,String> hMap = new HashMap<String,String>();
        Map<String,String> hMap2 = new HashMap<String,String>();

        Map<String ,String > map4 = Collections.singletonMap("4","33"); //store only a record , error - >UnSupportedOperationException

        //Simple entry mutable
        Map<String,String> map5 = Stream.of(new String[][]{
                {"test","Test"}
        }).collect((Collectors.toMap(data -> data[0], data->data[1])));

        System.out.println(map5.get("test"));

        // Simple entry Immutable
        Map<String ,String > map6 = Stream.of(
                new AbstractMap.SimpleEntry<>("d","D"),
                new AbstractMap.SimpleEntry<>("a","A")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        //Empty, Singleton, multi value
        Map<String,String> empty = Map.of();
        Map<String,String> singleton = Map.of("t","t");
        Map<String,String> multi = Map.of("t","t", "e","E");

        // of entry - Immutable
        Map<String,String> map7 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("A","a"),
                new AbstractMap.SimpleEntry<>("B","b")
        );

        System.out.println(map7.get("A"));
        //map7.put("C","c"); // UnsupportedOperationException

        //Map using Guava - Google
        //Map<String,String> map8  = ImmutableMap.of("a","a","e","e");
    }
}
