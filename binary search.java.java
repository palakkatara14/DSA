import java.util.*;
public class Main{
    public static void BinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        BinarySearch(arr,target);
        
    }
}