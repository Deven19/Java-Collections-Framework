package ArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizeArrayList {
    public static void main(String args[]){
        List<String> list =  Collections.synchronizedList(new ArrayList<String>());

        list.add("asd1");
        list.add("asd2");
        list.add("asd3");

        synchronized (list){
            Iterator<String> it = list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }


        System.out.println("-------Copyonwritearr");
        CopyOnWriteArrayList<String> cal1 = new CopyOnWriteArrayList<String>();
        cal1.add("N");
        cal1.add("T");
        cal1.add("R");

        Iterator<String> it2 = cal1.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
