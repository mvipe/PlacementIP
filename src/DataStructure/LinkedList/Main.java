package DataStructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list.insertFirst(20);
        list.display();

        list.insertFirst(30);
        list.display();

        list.insertFirst(40);
        list.display();

        list.insertLast(50);
        list.display();

       list.insertRec(5,0);
       list.display();
    }
}
