import java.util.Scanner;

public class Prectice_set_chapter_14_03 {
    public static void main(String[] args) {
        boolean flag=true;
        int[] arr={4,6,1,4,8};
        int i=0;
        Scanner sc=new Scanner(System.in);
        while (flag && i<5){
            try {
                System.out.print("Enter index = ");
                int index=sc.nextInt();
                System.out.println(arr[index]);
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println("enter valid index, index must have less then 5.");
                i++;
            }
        }
        System.out.println("you intered "+i+" time worng index...");
    }
}
