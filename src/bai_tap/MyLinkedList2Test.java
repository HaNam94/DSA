package bai_tap;

public class MyLinkedList2Test {
    public static void main(String[] args) {
        MyLinkedList2 myList = new MyLinkedList2();
        System.out.println("Total elements: " + myList.size());
        myList.addFirst(3);
        myList.addFirst(5);
        myList.addFirst(7);
        myList.addFirst(9);
        myList.addFirst(11);

        System.out.println("Total elements: " + myList.size());
        myList.printList();

        System.out.println("=============");
        System.out.println();
        myList.printList();
        System.out.println("index of 'ZZZ': " + myList.indexOf("ZZZ"));


    }
}
