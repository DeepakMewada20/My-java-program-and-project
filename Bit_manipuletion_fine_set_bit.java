import java.lang.String;
class exceotion extends Exception{
    @Override
    public String getMessage(){
        return "this is invelid input";
    }
}
public class Bit_manipuletion_fine_set_bit {
    public static void main(String[] args) {
        int n=8;
        boolean flag=true;
        System.out.println(Integer.toBinaryString(n));
        int i=0;
            try {
                if(n<1) {
                    throw new exceotion();
                }
                while (flag) {
                    int bitmass = 1 << i;
                    if ((n & bitmass) != 0) {
                        flag = false;
                    }
                    i++;
                }
                System.out.println(i+" bit is set bit");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
