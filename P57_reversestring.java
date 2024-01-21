public class P57_reversestring {
    public static String rs(String str){
        if(str.length()==1){
            return str;
        }
        char currchar = str.charAt(0);
        String next =  rs(str.substring(1));
        return next  + currchar;
    }
    public static void main(String[] args) {
        int n=0;
        //String name = new String("niranjan");
        String ans = rs("niranjan");
        System.out.println(ans);
    }
}
