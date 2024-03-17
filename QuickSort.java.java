import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={2,1,3,9,4,7,5};
        
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[] arr,int low,int high){
        if(low>high){
            return;
        }
        int pi=pivotIndex(arr,low,high);
        quick(arr,low,pi-1);
        quick(arr,pi+1,high);
    }
    public static int pivotIndex(int[] arr,int low,int high){
        int pivot=arr[high];
        int pi=low;
        for(int i=low;i<high;i++){
            if(arr[i]<=pivot){
                int t=arr[i];
                arr[i]=arr[pi];
                arr[pi]=t;
                pi++;
                
            }
        }
        int t=arr[high];
        arr[high]=arr[pi];
        arr[pi]=t;
        return pi;
    }
}