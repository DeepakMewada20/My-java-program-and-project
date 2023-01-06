import java.util.Scanner;

class Rectengal{
    int n;
    void rectengal_perten(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num for print rectengal = ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i==0) {
                System.out.println("*");
            }
            else if ((i>0)&&(i<(n-1))) {
                System.out.print("*");
                for(int j=i;j>0;j--){
                    System.out.print("   ");
                }
                System.out.println("*");

            }
            else {
                for(int k=0;k<(n);k++) {
                    System.out.print("*  ");
                }
            }
        }
    }
}
public class Rectengal_parten {
    public static void main(String[] args) {
        Rectengal r=new Rectengal();
        r.rectengal_perten();
    }
}
