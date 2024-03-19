import java.util.*;
public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    
    public static void add_first(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void add_Last(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int index,int data){
        if(index==0){
            add_first(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            temp.next=newNode;
        }
    }
    public int removefirst(int data){
        if(size==0){
            System.out.print("linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
        }
        
    
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.add_first(3);
        ll.add_first(4);
        ll.add_Last(2);
        ll.add_Last(1);
        ll.add(2,9);
        ll.print();
        ll.removefirst(2);
        ll.print();
        System.out.println("the size of linkedlist is: ");
        System.out.println(ll.size);
    }
       
}

