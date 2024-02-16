import java.util.*;
public class Main{
    public static void main(String[] args){
        int n=3;
        print(n,0,"");
        
    }
    public static void print(int n,int lastplace,String str){
        if(n==0){
           System.out.println(str);
           return;
        }
        print(n-1,0,str+"0");
        if(lastplace==0){
            print(n-1,1,str+"1");
        }
      
        
        
    }
}