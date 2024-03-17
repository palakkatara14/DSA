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
            temp.next=newNode;
        }
        
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
            
        }
        return -1;
    }

    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.add_first(3);
        ll.add_first(4);
        ll.add_Last(2);
        ll.add_Last(1);
        ll.add(2,9);
        ll.print();
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
       
    }
       
}

