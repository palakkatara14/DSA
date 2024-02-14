import java.util.*;
public class Main{
    public static void main(String[] args) {
        int []arr={1,2,2};
        Arrays.sort(arr);
        printSubsets2(arr,new ArrayList<Integer>(),0);
        
    }
   

    static void printSubsets2(int[]arr,ArrayList<Integer> list,int lp){
        System.out.println(list);
        for (int i = lp; i <arr.length ; i++) {
            list.add(arr[i]);
            printSubsets2(arr,list,i+1);
            while(i<arr.length-1 && arr[i]==arr[i+1]){
                i++;
            }
            list.remove(list.size()-1);

        }
    }


}