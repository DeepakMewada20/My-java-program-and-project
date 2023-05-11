public class Bit_Manipuletion_update_bit {
    public static void main(String[] args) {
        int n=434;
        int bitmass=1<<3;
        System.out.println(Integer.toBinaryString(n));
        if((n&bitmass)==0){
            int newbit=n|bitmass;
            System.out.println(Integer.toBinaryString(newbit));
        }
        else {
            bitmass = ~bitmass;
            int newbit=n&bitmass;
            System.out.println(Integer.toBinaryString(newbit));
        }
    }
}
