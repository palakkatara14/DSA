import java.util.*;
public class Main{
    public static void Deletion(int[] arr){
        
        int del_element=30;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==del_element){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        
    
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       Deletion(arr);
        
    }
}