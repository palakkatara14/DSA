import java.util.*;
public class Main{
     
      public static void subsequences(String str,int index,String newString){
         if(index==str.length()){
            
            System.out.println(newString);
            return;
            
        }
        char currChar=str.charAt(index);
        subsequences(str,index+1,newString+currChar);
        subsequences(str,index+1,newString);
        
        
        
    }
    public static void main(String[] args){
         String str="abc";
        subsequences(str,0,"");
        
        
        
    }
}