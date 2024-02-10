import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        printfib(a,b,n-2);
    }
    public static void printfib(int a,int b,int n){
        if(n==0){
            return;
        }
        
        int c=a+b;
        System.out.println(c);
        printfib(b,c,n-1);
        
        
    }
    
    
}