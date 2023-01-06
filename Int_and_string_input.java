import java.util.*;
public class Int_and_string_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        String[]str=new String[10];
        for (int i=0;i<10;i++){
            System.out.print("Enter num = ");
            arr[i]=sc.nextInt();
            sc.nextLine();
            System.out.print("enter name = ");
            str[i]=sc.nextLine();
        }
        for (int i=0;i<10;i++){
            System.out.println(arr[i]);
            System.out.println(str[i]);
        }
    }
}
