public class P44_reverseString {
    public static void  main(String[] args){
        StringBuilder str = new StringBuilder("niranjan");
        for(int i=0;i<str.length()/2;i++){
            int front = i;
            int back = str.length() -1-i;

            char frontchar = str.charAt(front);
            char backchar = str.charAt(back);

            str.setCharAt(front, backchar);
            str.setCharAt(back, frontchar);
        }
        System.out.println(str);
    }
}
