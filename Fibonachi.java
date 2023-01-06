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
    static void argument(int...a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("\naverage of argument is = "+(float)sum/a.length);
    }


        static int recarsive_fib(int n){
        int f=0;
        if (n==1){
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else {
            return f=recarsive_fib(n-1)+recarsive_fib(n-2);
        }
    }
    static void partern(int n){
        if (n>0){
//            partern(n-1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
            partern(n-1);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for, print fibonachi series = ");
        n=sc.nextInt();
        fibonachi(n);
        argument(3,5,4,7,8,87);
        System.out.println("index of "+n+" alue in fibinachi seris = "+recarsive_fib(n));
        partern(n);

    }
}
