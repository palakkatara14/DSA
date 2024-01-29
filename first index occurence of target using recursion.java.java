

public class Main{
    public static void main(String[] args){
        int[] arr={1,2,3,2,2};
        int target=3;
        System.out.println(find(arr,target,0));
    }
    public static int find(int[] arr,int target,int index){
            if(index==arr.length-1){
                return -1;
            }
            
            
            
            
            if(arr[index]==target){
                return index;
            }
            return find(arr,target,index+1);
    }
}