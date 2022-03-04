package Vector;

import java.util.Vector;

public class Vector2d {
    public static void main(String[] args){
        Vector<Integer> v1 = new Vector<>();
        v1.add(3);
        v1.add(4);

        Vector v2 = new Vector<>();
        v2.add(2);
        v2.add(v1);

        for(int i = 0; i<v1.size(); i++){
            Integer s = (Integer)((Vector)(v2.get(1))).get(i);
            System.out.println(s);
        }
    }
}
