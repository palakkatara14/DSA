import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printsum(n,0,1);
    }
    public static void printsum(int n,int sum,int i){
        //base condition
        if(i==n){                       //if(n==0){
            sum+=i;                     //   System.out.println(sum);
                                        // return;
                                        //}
                                         //sum+=n;
                                         //printsum(n-1,sum);
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsum(n,sum,i+1);
    }
    
    
}