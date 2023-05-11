public class Bit_Manipuletion_check_pawer_of_2 {
    public static void main(String[] args) {
        int n=6;
        int bitmass = 1;
        if((n&bitmass)==0) {
            System.out.println("Number is power of 2");
        }
        else {
            System.out.println("Number is not power of 2");
        }
    }
}
