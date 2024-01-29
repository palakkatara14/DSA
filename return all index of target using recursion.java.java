import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={1,2,7,2,4,2};
        int target=2;
        int[] ans=find(arr,target,0,0);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] find(int[] arr,int target,int index,int count){
           if(index==arr.length){
               return new int[count];
           }
           if(arr[index]==target){
               count++;
           }
           int[] ans=find(arr,target,index+1,count);
           if(arr[index]==target)
           ans[count-1]=index;
           return ans;
           
    }
}