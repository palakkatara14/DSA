import java.util.*;
public class Main{
     
      public static void Uniquesubsequences(String str,int index,String newString,HashSet<String> set){
         if(index==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
            
            
        }
        char currChar=str.charAt(index);
        Uniquesubsequences(str,index+1,newString+currChar,set);
        Uniquesubsequences(str,index+1,newString,set);
        
        
        
    }
    public static void main(String[] args){
         String str="aaa";
         HashSet<String> set=new HashSet<>();
        Uniquesubsequences(str,0,"",set);
        
        
        
    }
}