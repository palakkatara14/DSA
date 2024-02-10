import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(printpow(x,n));
    }
    public static int printpow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        
        int c=printpow(x,n-1);
        int d=c*x;
        return d;
        
        
        
    }
    
    
}