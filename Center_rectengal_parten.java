import java.util.Scanner;

class Center_rectengal1{
    int n;
    void rectengal(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for rectengal parten, How many lines do you want to make = ");
        n=sc.nextInt();
        for (int k=0;k<n;k++){
            for (int i=k;i<n;i++){
                System.out.print(" ");
                if(i==(n-1)){
                    for (int j=k;j>=0;j--){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
public class Center_rectengal_parten {
    public static void main(String[] args) {
        Center_rectengal1 r1=new Center_rectengal1();
        r1.rectengal();
    }
}
