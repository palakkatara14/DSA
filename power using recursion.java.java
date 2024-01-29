

public class Main{
    public static void main(String[] args){
        int a=2;
        int b=3;
        System.out.println(power(2,3));
    }
    public static int power(int a,int b){
        if(b==0){
            return 1;
        }
       int sp=power(a,b-1);
       int bp=sp*a;
       return bp;
    }
}