
import java.util.Scanner;
public class Fibonachi {
    static void fibonachi(int n){
        int a1=0,a2=1,a3;
        System.out.print(a1+" "+a2+" ");
        for (int i=3;i<=n;i++){
            a3=a1+a2;
            System.out.print(a3+" ");
            a1=a2;
            a2=a3;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for, print fibonachi series = ");
        n=sc.nextInt();
        fibonachi(n);
    }
}
