package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompair {
    public static void main(String args[]){

        ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(2,6,1,0,44));
        ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(2,6,1,1,44));

        Collections.sort(al1);
        Collections.sort(al2);

        System.out.println(al1.equals(al2));


        System.out.println("------------Additional Ele");
        ArrayList<Integer> al3 = new ArrayList<Integer>(Arrays.asList(2,6,1,0,44));
        ArrayList<Integer> al4 = new ArrayList<Integer>(Arrays.asList(2,6,1,1,44));

        al3.removeAll(al4);
        System.out.println(al3);


        System.out.println("------------Missing Ele");
        ArrayList<Integer> al5 = new ArrayList<Integer>(Arrays.asList(2,6,1,0,44));
        ArrayList<Integer> al6 = new ArrayList<Integer>(Arrays.asList(2,6,1,27,44));

        al6.removeAll(al5);
        System.out.println(al6);


        System.out.println("------------Retain all");
        ArrayList<Integer> al7 = new ArrayList<Integer>(Arrays.asList(2,6,1,0,44));
        ArrayList<Integer> al8 = new ArrayList<Integer>(Arrays.asList(2,6,1,27,44));

        al7.retainAll(al8);
        System.out.println(al7);


    }
}
