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
        int index1=1;
        int index2=3;
        System.out.println(list);
        swap(list,index1,index2);
        System.out.println(list);
    }
    public static void swap(ArrayList<Integer> list,int index1,int index2){
        int temp=list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
    }
    
}