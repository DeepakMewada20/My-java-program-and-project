import java.util.Scanner;

public class Bit_Manipuletion_cheak_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number for cheak even or odd = ");
        int n= sc.nextInt();
        boolean numeven=(n&1)==0;
        System.out.println(numeven);

    }
}
