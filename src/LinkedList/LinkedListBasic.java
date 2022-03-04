package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList<>();
        System.out.println(l1.size());

        l1.add(89);
        l1.add(4);
        System.out.println(l1.size());
        System.out.println(l1.get(0));

        Iterator it = l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        l1.add(0,90);
        for(Integer i : l1){
            System.out.println(i);
        }

        l1.addFirst(4);
        l1.addLast(7657);
        l1.remove(2);

        ArrayList<Integer> arl = new ArrayList<>();
        arl.add(4);
        l1.removeAll(arl);

        System.out.println(l1);

    }
}
