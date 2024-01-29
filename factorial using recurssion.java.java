public class Main{
    public static void main(string[] args){
        int n=5;
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int sp=factorial(n-1);
        int bp=sp*n;
        return bp;
    }
}