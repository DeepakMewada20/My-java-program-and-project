import java.lang.String;
public class Bit_Manipulation_find_bit {
    public static void main(String[] args) {
        int n=54;
        System.out.println("Number repregent in binary = "+Integer.toBinaryString(n));
        int bitmass=1<<4;
        System.out.println("left sift in binary = "+Integer.toBinaryString(bitmass));
        if((n&bitmass)==0){
            System.out.println("bit is zero");
        }
        else {
            System.out.println("bit is one");
        }

    }

}
