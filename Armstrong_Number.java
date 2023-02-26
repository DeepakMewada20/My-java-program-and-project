import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for check given number is Armstrong Number 0r Not");
        int n=sc.nextInt();
        int result=0,m=n,k=n,i=0;
        while (m%10!=0){
            m=m/10;
            i++;
        }
        while (k%10!=0){
            int remainder,remainder_sum;
            remainder=k%10;
            remainder_sum=remainder;
            for (int j=0;j<i-1;j++){
                remainder_sum=remainder_sum*remainder;
            }
            k=k/10;
            result+=remainder_sum;
        }
        if(result==n){
            result=1;
        }
        System.out.print(result);
    }
}
