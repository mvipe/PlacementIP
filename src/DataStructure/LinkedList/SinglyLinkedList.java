package DataStructure.LinkedList;

import java.sql.SQLOutput;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        this.size=0;
    }
    private class Node{
        int val;
        Node next;

        Node(int val , Node next){
            this.val=val;
            this.next=next;
        }

        Node(int val){
            this(val,null);
        }
    }

    //insert operation
    public void insertLast(int val){
        Node newNode=new Node(val);
        if(tail!=null){
            tail.next=newNode;
            tail=newNode;
        }else if(head==null){
            head=newNode;
            tail=head;
        }

        size++;
    }

    public void insertFirst(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=head;
        }else{
            newNode.next=head;
            head=newNode;
        }

        size++;
    }

    public void insert(int val,int ind){
        if(ind==0) {
            insertFirst(val);
            return;
        }
        if(ind==size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for (int i = 0; i < ind-1; i++) {
            temp=temp.next;
        }

        Node newNode=new Node(val,temp.next);
        temp.next=newNode;

        size++;
    }

    public void insertRec(int val, int ind){
        head=insertRec(val,ind,head);
    }

    private Node insertRec(int val, int ind, Node temp){
        if(temp==null) return null;
        if(ind==0){
            Node newNode=new Node(val);
            newNode.next=temp;
            return newNode;
        }

        temp.next=insertRec(val,ind-1,temp.next);

        return temp;
    }

    //get
    public int get(int value){
        Node temp=head;
        int ind=0;

        while(temp!=null){
            if(temp.val==value) return ind;
            ind++;
            temp=temp.next;
        }

        return -1;
    }

    // deletion
    public void delete(int val){
        int ind=get(val);
        if(ind==-1 || ind>=size) return;

        if(ind==0){
            head=head.next;
            size--;
            return;
        }

        Node tmp=head;
        for (int i=0;i<ind-1;i++){
            tmp=tmp.next;
        }

        tmp.next=tmp.next.next;
        size--;

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
}
