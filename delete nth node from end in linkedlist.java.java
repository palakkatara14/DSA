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
    
    
    public static void add_first(int data){
        Node newNode=new Node(data);
       
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void add_Last(int data){
        Node newNode=new Node(data);
       
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void add(int index,int data){
        if(index==0){
            add_first(data);
            return;
        }
        Node newNode=new Node(data);
       
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void deleteNthfromEnd(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;//remove first
            return;
        }
        //size-n
        int i=1;
        int iToFind=size-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.add_first(3);
        ll.add_first(4);
        ll.add_Last(2);
        ll.add_Last(1);
        ll.add(2,9);
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
    }
       
}

