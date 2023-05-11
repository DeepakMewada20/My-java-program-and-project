public class Bit_Manipuletion_clear_bit {
    public static void main(String[] args) {
        int n=738;
        int bitmass=1<<5;
        bitmass = ~(bitmass);
        int newbit = n & bitmass;
        System.out.println("old bit = "+Integer.toBinaryString(n));
        System.out.println("new bit = "+Integer.toBinaryString(newbit));
    }
}
