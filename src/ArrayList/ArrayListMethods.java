package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.StreamSupport;

public class ArrayListMethods {
    public static void main(String[] args){
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("J");
        ar1.add("P");
        ar1.add("C");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("J");
        ar2.add("P");
        ar2.add("C2");

//        ar1.addAll(ar2);
        ar1.addAll(1,ar2);

        System.out.println(ar1);

        System.out.println("--------clear");
//        ar2.clear();

        System.out.println(ar2);

        System.out.println("--------clone");
        ArrayList<String> ar3 = (ArrayList<String>)ar2.clone();
        System.out.println(ar3);

        System.out.println("--------contains");
        System.out.println(ar3.contains("J"));

        System.out.println("--------contains");
        System.out.println(ar3.indexOf("C2"));

        System.out.println("--------Remove even odd");//remove, removeall,removeif
        ArrayList<Integer> al4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        al4.removeIf(num->num%2 ==0);
        System.out.println(al4);


        System.out.println("--------Retain-------");
        ArrayList<String> al5 = new ArrayList<String>(Arrays.asList("K","g","t","e","e"));
        al5.retainAll(Collections.singleton("e"));
        System.out.println(al5);


        System.out.println("-------Sublist");
        ArrayList<String> al6 = new ArrayList<String>(Arrays.asList("K","g","t","e","e"));
        ArrayList<String> al7 = new ArrayList<>(al6.subList(1,5));
        System.out.println(al7);

        System.out.println("----------ToString");
        Object arr1[] = al7.toArray();
        System.out.println(Arrays.toString(arr1));

        for(Object s:arr1){
            System.out.println((String)s);
        }

    }
}
