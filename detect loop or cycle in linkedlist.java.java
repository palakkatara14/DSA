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
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            if(slow==fast){
                return true;  //cycle exist
            }
        }
        return false;  //cycle not exist
    }

    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=head;
        System.out.println(isCycle());
    }
       
}

