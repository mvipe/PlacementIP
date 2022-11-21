package DataStructure.LinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;

    private class Node{
        int val;
        Node next;
        Node prev;

        Node(int val , Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }

        Node(int val){
            this(val,null,null);
        }
    }

    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
    }

    // insert
    public void insertFirst(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=head;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    public void insertLast(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=head;
        }else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }



    //display linked list
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void displayReverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.prev;
        }
        System.out.println("null");
    }


}
