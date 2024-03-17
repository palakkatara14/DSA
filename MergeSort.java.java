import java.util.*;
public class Main{
    public static void main(String[] args){
        int[]arr={1,2,4,7,8,3,5,6};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[]arr,int start,int end){
        if(start==end){                  //when st>ed will never run outofbounderror
            return;
        }
        int mid=(start+end)/2;         //mid=0   
        mergeSort(arr,start,mid);       
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);

    }
    public static int[] merge2(int[] arr1,int[] arr2){   //void
        
        int n=arr1.length;
        int m=arr2.length;
        int[] ans=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        
        while(i<n || j<m){
            if(j==m){
               ans[k]=arr1[i];
               k++;
               i++;
            }
            else if(i==n){
                ans[k]=arr2[j];
                j++;
                k++; 
            }
            else{
                if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
              
                i++;
                k++;
                }
                else{
                   ans[k]=arr2[j];
                   j++;
                   k++; 
                }
            }
                
        }
       return ans;  //System.out.println(Arrays.toString(ans))
    }

    public static void merge(int[]arr,int start,int mid,int end){
        int[] a=new int[mid-start+1];
        int[] b=new int[end-mid];
        int k=0;
        for(int i=start;i<=mid;i++){
              a[k]=arr[i];
              k++;
        }
        k=0;
        for(int i=mid+1;i<=end;i++){
            b[k]=arr[i];
            k++;
        }
        
        int[] c= merge2(a,b);
        k=0;
        for(int i=start;i<=end;i++){
            arr[i]=c[k];
            k++;
        }
        //twosorted obj=new twosorted();
        //int[] c=obj.merge(a,b);
        //System.out.println(Arrays.toString(c));

   }
}