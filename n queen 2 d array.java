import java.util.*;
public class Main{
    public static void main(String[] args){
        int[][] board=new int[4][4];
        int q=4;
        display(board);
        print(board,q,0);
    }
    public static void print(int[][] board,int tq,int row){
        if(tq==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length){
            return;
        }
        for(int col=0;col<board[0].length;col++){
            if(ispossible(board,row,col)){
                board[row][col]=1;
                print(board,tq-1,row+1);
                board[row][col]=0;
            }
        }
    }
    public static boolean ispossible(int[][] board,int row,int col){
        //for col
        int r=row;
        int c=col;
        while(r>=0){
            if(board[r][col]==1){
                return false;
            }
            r--;
        }
        //left diagonal
        r=row;
        c=col;
        while(r>=0 && c<board[0].length){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c++;
        }
        //for right diagonal
        r=row;
        c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c--;
        }
        return true;
    }
    public static void display(int[][] board){
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}