import java.util.*;
public class Main{
   public static void main (String[] args) {
        HashSet<Integer> set=new HashSet<>();
        //insert,add elements in set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //display set
        System.out.println(set);
        //display size of set
        System.out.println(set.size());
        //remove element
        set.remove(3);
        System.out.println(set);
       
        //search element in set
        if(set.contains(1)){
            System.out.println("exist 1"); 
        }
        else{
            System.out.println("not exist 1");
        }
        //Iterator
        //it.next()=next element ko dega
        //it.hasNext()=true ya false dega
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        
    }
}