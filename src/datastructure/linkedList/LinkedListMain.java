package datastructure.linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        MsLinkedList list = new MsLinkedList();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.addLast(4);
        list.addLast(5);

        list.remove(3);
        list.addFirst(6);

        list.print();
    }
}
