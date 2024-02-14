import java.util.*;
public class Main{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
            if(min>list.get(i)){
                min=list.get(i);
            }
        }
        System.out.println(max);
        System.out.println(min);
        
        
        
        
        
        
        
    }
    
}