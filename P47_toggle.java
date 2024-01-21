public class P47_toggle {
    public static void main(String[] args) {
        int  n = 5;//0101
        int pos  = 1;
        int bitmask = 1<<pos;

        System.out.println(n ^ bitmask);
    }
}
