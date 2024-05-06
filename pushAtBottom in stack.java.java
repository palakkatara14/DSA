import java.util.*;
public class StackClass{
    public static void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer>  s=new Stack<>();//collection framework
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        s.push(1);
        s.push(2);
        s.push(3);
        
        pushAtBottom(data,s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}