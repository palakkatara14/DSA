import java.util.*;
public class Main{
    
    public static boolean isSorted(int[] arr,int index){
        if(index==arr.length-1){
           
            return true;
        }
        
        if(arr[index]<arr[index+1]){
            return isSorted(arr,index+1);
        }
        else{
            return false;
        }
        
        
    }
    public static void main(String[] args){
        int [] arr={1,7,6};
        System.out.println(isSorted(arr,0));
        
        
        
    }
}