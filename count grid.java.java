public class Main{
    static int count=0;
    public static void main(String[] args) {
        int[][] array=new int[3][3];
        print(array, "", 0,0);
        System.out.println(count);
    }
    public static void print(int[][] array,String ans ,int row,int col){
        if(row==2 && col==2){
            count++;
            return;
        }
        if(row<0 || col<0 || row>=array.length || col>=array.length|| array[row][col]==1){
            return;
        }

        int[] r={0,1,0,-1};
        int[] c={1,0,-1,0};
        array[row][col]=1;
        for(int i=0;i<c.length;i++){
            print(array, ans, row+r[i], col+c[i]);
        }
        array[row][col]=0;

    }
}