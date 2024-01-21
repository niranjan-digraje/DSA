public class P41_change {
    public static void main(String[] args){
        String str = "abcdef";
        String result = " ";
        for(int  i=0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                result += "i";
            }    
            else{
                result +=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
