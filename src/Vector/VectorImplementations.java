package Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorImplementations {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();
        v.add(3);
        v.add(55);

        System.out.println(v.get(0));

        Vector<Integer> v2 = new Vector<>();
        v2.addAll(v);
        System.out.println(v2);

        for(Integer i : v2){
            System.out.println(i);
        }

        Iterator it = v2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
