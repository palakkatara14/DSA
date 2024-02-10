public class Main{
    public static void main(String[] args){
        int tq=2;
        boolean[] board=new boolean[4];
        Queen(board,tq,"",1,0);
    }
    public static void Queen(boolean[] board,int tq,String ans,int qp,int idx){
        if(tq<qp){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                Queen(board,tq,ans+"B"+i+"Q"+qp,qp+1,i+1);
                board[i]=false;
                
                 
            }
        }
    }
}