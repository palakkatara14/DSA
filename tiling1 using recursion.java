import java.util.*;
public class Main{
    public static void main(String[] args){
        int n=5;
        System.out.println(tiling(n));
        
    }
    public static int tiling(int n){
        if(n==0||n==1){
            
            return 1;
        }
        int f1=tiling(n-1);
        int f2=tiling(n-2);
        int fn=f1+f2;
        return fn;
        
      
        
        
    }
}