public class Bit_manipulation_set_bit {
    public static void main(String[] args) {
        int n=51;
        int bitmass=1<<2;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(bitmass));
        int newbit=n|bitmass;
        System.out.println("new bit is = "+Integer.toBinaryString(newbit));
    }
}
