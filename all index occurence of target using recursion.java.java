import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={1,2,7,2,4,2};
        int target=2;
        ArrayList<Integer> list=new ArrayList<>();
        find(arr,target,0,0,list);
       
        System.out.print(list);
    }
    public static ArrayList<Integer> find(int[] arr,int target,int index,int count,ArrayList<Integer> list){
            if(index==arr.length){
                return new ArrayList<>(count);
            }
            if(arr[index]==target){
                count++;
            }
            find(arr,target,index+1,count,list);
            if(arr[index]==target){
               
                list.add(index);
                Collections.sort(list);
            }
            return list;
    }
}