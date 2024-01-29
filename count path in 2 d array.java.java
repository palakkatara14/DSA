import java.util.*;
public class Main{
    public static void main(String[] args){
        int n=3;
        int m=3;
        int[][] arr=new int[3][3];
        for(int i=0;i<arr.length();i++){
            print(arr," ",0,0);
            
        }
        public static void print(int[][] arr,String ans,int row,int col){
            if(row==2&&col==2){
                System.out.println(ans);
                return;
            }
            if(row<=1){
                print(arr,ans+"V",row+1,col);
            }
            if(col<=1){
                print(arr,ans+"H",row,col+1);
            }
        }
        
    }
}