import java.util.*;
public class Main{
    public static int first=-1;
    public static int last=-1;
    public static void findOccurances(String str,int index,char element){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        
        char currChar=str.charAt(index);
        if(currChar==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        findOccurances(str,index+1,element);
    }
    public static void main(String[] args){
        String str="abaacdaefaah";
        findOccurances(str,0,'a');
        
        
        
    }
}