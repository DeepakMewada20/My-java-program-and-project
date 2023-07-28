import java.util.Scanner;

public class Bit_manipuletion_number_is_power_2_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check the number is power of to or not = ");
        int number =sc.nextInt();
        if ((number&(number-1))==0){
            System.out.println("Yes! the number is power of 2");
        }
        else {
            System.out.println("No! the number is not power of 2");
        }
    }
}
