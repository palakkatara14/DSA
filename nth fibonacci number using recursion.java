import java.util.*;
public class Main{
    public static void main(String[] args){
        int n=6;
        System.out.println(print(n));
        
    }
    public static int print(int n){
        if(n==0||n==1){
            
            return n;
        }
        int f1=print(n-1);
        int f2=print(n-2);
        int fn=f1+f2;
        return fn;
        
      
        
        
    }
}