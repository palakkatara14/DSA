import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={1,2,3};
        print(arr,0,new ArrayList<Integer>());
    }
    public static void print(int[] arr,int lp,ArrayList<Integer> list){
        System.out.println(list);
        for(int i=lp;i<arr.length;i++){
            list.add(arr[i]);
            print(arr,i+1,list);
            list.remove(list.size()-1);
        }
    }
}