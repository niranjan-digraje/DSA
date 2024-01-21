public class P43_stringBuilder {
    public static void main(String[] args){
        //declaration
        StringBuilder sb = new StringBuilder("niranjan");
        System.out.println(sb);

        //character at index
        System.out.println(sb.charAt(0));

        //set character  at index
        sb.setCharAt(1,'a');
        System.out.println(sb);

        //insert character at index
        sb.insert(1, 'i');
        System.out.println(sb);

        //delete character at index
        sb.delete(2, 3);
        System.out.println(sb);

        //append character at end
        sb.append(" digraje");
        System.out.println(sb);

        //length of string
        System.out.println(sb.length());
    }
}
