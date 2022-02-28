package ArrayList;


import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayListTest {
    public static void main(String[] args) {
        System.out.println("as");

        ArrayList<Object> as = new ArrayList<Object>();
        as.add("as1");
        as.add("33");
        as.add(8);

        System.out.println(as);

        System.out.println(as.get(0));
        System.out.println("----------");
        for(int i = 0; i<as.size(); i++){
            System.out.println(as.get(i));
        }
        System.out.println("----------");
        for(Object s:as){
            System.out.println(s);
        }
        System.out.println("----------Stream");
        as.stream().forEach(el->{System.out.println(el);});

        System.out.println("----------");

        ArrayList<Integer> as2 = new ArrayList<Integer>();
        as2.add(2);
        as2.add(5);
        as2.add(90);
        as2.add(99);
        as2.add(-2);

        Collections.sort(as2);
        System.out.println(as2);

        System.out.println("----------It");

        Iterator<Integer> it = as2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("----------initiate with other array list");
        ArrayList<Integer> arList = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,6));
        System.out.println(arList);

        Iterator<Integer> it2 = arList.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        System.out.println("----------------------remove duplicates");
        HashSet<Integer> removeDuplicate = new HashSet<>(arList);
        List<Integer> unList = new ArrayList<Integer>(removeDuplicate);
        System.out.println(unList);

        System.out.println("--------Otherway");
        ArrayList<Integer> arList2 = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,6));
        List<Integer> li2 = arList2.stream().distinct().collect(Collectors.toList());
        System.out.print(li2);

    }

}
