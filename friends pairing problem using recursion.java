import java.util.*;
public class Main{
    public static void main(String[] args){
        int n=3;
        System.out.println(print(n));
        
    }
    public static int print(int n){
        if(n==1||n==2){
            
            return n;
        }
        int f1=print(n-1);
        int f2=print(n-2);
        int f=f1*f2;
        int total=f1+f;
        return total;
        
      
        
        
    }
}