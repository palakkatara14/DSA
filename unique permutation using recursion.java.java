public class Main{
    public static void main(String[] args){
        String str="aba";
        String ans=" ";
        UniquePermutation(str," ");
    }
    public static void UniquePermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean flag=false;
            for(int j=i+1;j<str.length();j++){
                if(ch==str.charAt(j)){
                    flag=true;
                }
            }
            if(flag==false){
              UniquePermutation(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i));  
            }
            
        }
    }
    
}