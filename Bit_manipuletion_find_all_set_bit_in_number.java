import java.util.Scanner;

public class Bit_manipuletion_find_all_set_bit_in_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to fine all set Bit = ");
        int number=sc.nextInt();
        System.out.println(Integer.toBinaryString(number));
        int count_of_bit=0;
        //FIRST method to find all set Bit
//        while (number>0){
//            count_of_bit++;
//            number-=number&(-number);
//        }
        //SECOUND method to find all set Bit
        while (number>0){
            count_of_bit++;
            number=number&(number-1);
        }
        System.out.println(count_of_bit);
    }
}
