public class Main{
    public static void main(String[] args){
        String str="abc";
        String ans=" ";
        PrintPermutation(str," ");
    }
    public static void PrintPermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            PrintPermutation(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i));
        }
    }
    
}