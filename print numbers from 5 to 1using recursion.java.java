import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
    public static void print(int n){
        //base condition
        if(n==0){
            return;
        }
        //print
        System.out.println(n);
        //recursion
        print(n-1);
    }
    
    
}