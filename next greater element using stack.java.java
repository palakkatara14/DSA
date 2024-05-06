import java.util.*;
public class StackClass{
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        int[] a={6,8,0,1,3};
        int nextGreater[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=a[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
           
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    
    }
    
}