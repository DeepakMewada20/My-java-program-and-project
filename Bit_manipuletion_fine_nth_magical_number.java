import java.util.Scanner;

public class Bit_manipuletion_fine_nth_magical_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbber for fine magical number = ");
        int number= sc.nextInt();
        int magical_number=0;
        int n=number;
        int base=5;
        while (number>0){
            int last=number&1;
            number=number>>1;
            magical_number+=base*last;
            base=base*5;
        }
        System.out.println(magical_number);
        //find number of digites of any number using log
        //log(10)base(2)=3.32
        //10=(binary)1010
        int total_bit=(int)(Math.log(n)/Math.log(2))+1;
        System.out.println("total bit of 10 in binary is "+total_bit);
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(0-5));
    }
}
