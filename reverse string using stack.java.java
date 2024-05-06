import java.util.*;
public class StackClass{
    public static String StringReverse(String str){
        Stack<Character> s=new Stack<>();
        int index=0;
        while(index<str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result=new StringBuilder(" ");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
            
        }
        return result.toString();
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result=StringReverse(str);
        System.out.println(result);
    }
   
    
}