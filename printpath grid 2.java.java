public class Main{
    static int count=0;
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        print(arr, "", 0,0);
        System.out.println(count);
    }
    public static void print(int[][] arr,String ans ,int row,int col){
        if(row==2 && col==2){
            count++;
           System.out.println(ans);
            return;
        }
        if(row<0 || col<0 || row>=arr.length || col>=arr.length|| arr[row][col]==1){
            return;
        }
        arr[row][col]=1;
        print(arr,ans+"V",row+1,col);
        print(arr,ans+"H",row,col+1);
        print(arr,ans+"V",row-1,col);
        print(arr,ans+"H",row,col-1);
        arr[row][col]=0;
        

    }
}