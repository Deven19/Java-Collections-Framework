package LinkedList;

public class LinkedListImplementation {

    /*
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void printLinkedList(){
        Node n = head;
        while (n !=null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args){
        LinkedListImplementation l1 = new LinkedListImplementation();
        Node first = l1.new Node(2);
        l1.head = first;

        Node second = l1.new Node(5);
        first.next = second;

        Node third = l1.new Node(77);
        second.next = third;

        l1.printLinkedList();


    }
    */

    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void printLinkedList(){
        Node n = head;
        while (n !=null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args){
        LinkedListImplementation l1 = new LinkedListImplementation();
        Node first = l1.new Node(1);
        l1.head = first;

        Node second = l1.new Node(3);
        first.next = second;

        Node third = l1.new Node(5);
        second.next = third;

        l1.printLinkedList();

    }
}
