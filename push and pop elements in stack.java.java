import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<Integer>();
        //pushing the elements in stack
        stack.push(10);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(5);
        System.out.println("Initial Stack: "+stack);
        //pop the elements
        System.out.println("pop elements: "+stack.pop());
        System.out.println("pop elements: "+stack.pop());
        System.out.println("Stack after pop elements: "+stack);
        
    }
}