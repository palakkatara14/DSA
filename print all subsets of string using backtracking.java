import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        print(str,"",0);
        
    }
    public static void print(String str,String ans,int i){
        if(i==str.length()){
            
            System.out.println(ans);
            
            return;
            
        }
        print(str,ans,i+1);
       
        print(str,ans+str.charAt(i),i+1);
        
       
       
    }    
    
    
}