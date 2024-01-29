import java.util.*;
public class Main{
    public static void Insertion(int[] arr,int position){
        
        int element=100;
        for(int i=arr.length-1;i>position-1;i--){
            arr[i]=arr[i-1];
        }
        arr[position-1]=element;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int position=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       Insertion(arr,position);
        
    }
}