//Dequeue:remove/pop (start)
//enqueue:add/push (last se)
//front rear
import java.util.*;
public class Queue{
    int[] queue;
    int front=0;
    int rear=-1;
    static int size=0;
    public Queue(){
        queue=new int[5];
    }
    public Queue(int size){
        queue=new int[size];
    }
    public boolean isFull(){
        return size==queue.length;
        
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enQueue(int val){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        rear=(rear+1)%queue.length;
        queue[rear]=val;
        size++;
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int val=queue[front];
        front=(front+1)%queue.length;
        size--;
        return val;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
       Queue q=new Queue();
       System.out.println(q.isEmpty());
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        System.out.println(q.isFull());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(Arrays.toString(q.queue));
       
        System.out.println(size);
        q.enQueue(60);
        q.enQueue(70);
        q.enQueue(80);
        System.out.println(Arrays.toString(q.queue));
        System.out.println(q.front);
        System.out.println(q.rear);
        System.out.println(size);
        
        
        
        
    }
}