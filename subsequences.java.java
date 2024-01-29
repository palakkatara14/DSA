import java.util.*;
public class Main{
    public static void main(String[] args){
        String str="abc";
        String ans="";
        findsubsequences(str,"");
        
    }
    public static void findsubsequences(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        findsubsequences(str.substring(1),ans+str.charAt(0));
         findsubsequences(str.substring(1),ans);
        
    }
}