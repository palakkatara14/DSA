public class Main{
    public static void main(String[] args){
        int n=3;
        String ans="";
        print(n,"");
    }
    public static void print(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        print(n-1,ans+"H");
        print(n-1,ans+"T");
    }
}