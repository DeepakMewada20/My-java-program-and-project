import java.util.Scanner;

public class Bit_manipuletion_calculet_power_of_any_number {
    public static void main(String[] args) {
        int ans=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base = ");
        int base= sc.nextInt();
        System.out.print("Enter power = ");
        int power= sc.nextInt();
        while (power>0){
            if ((power&1)==1){
                ans=ans*base;
            }
            base=base*base;
            power=power>>1;
        }
        System.out.println(ans);
    }
}
