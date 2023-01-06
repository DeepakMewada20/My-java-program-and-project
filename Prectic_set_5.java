import java.util.Scanner;

public class Prectic_set_5 {
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("Enter number for print reverse table = ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=10;i>0;i--){
            sum+=n*i;
            System.out.println(n+" x " +i+ " = "+n*i);
        }
        System.out.println("total sum of this table is = "+sum);
    }
}