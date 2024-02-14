import java.util.*;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
       
        //for ascending order
        Collections.sort(list);
        System.out.println(list);
        //for descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    
    
}