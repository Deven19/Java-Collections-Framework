package HashTable;

import java.util.Hashtable;

public class HashTableBasic {
    public static void main(String[] args){
        /*
        * hash("a") -> hashcode % 11 -index(3)
        * null key values are not allowed
        * HT - 11 LF 0.75
        * Same index or collision will be connected with linkedlist
        *
        * */
        Hashtable<String,String > hTable = new Hashtable<>();
        hTable.put("A","a");
        hTable.put("B","b");

        System.out.println(hTable);
        System.out.println(hTable.get("A"));
    }
}
