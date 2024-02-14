import java.util.*;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(11);
        list1.add(15);
        mainList.add(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(6);
        list2.add(8);
        mainList.add(list2);
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println(mainList);
            //System.out.println();
        }
    }
    
    
}