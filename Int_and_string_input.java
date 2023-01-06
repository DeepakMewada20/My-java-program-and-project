//how to take input string after integer
import java.util.*;
public class Int_and_string_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];  //decleiar array
        String[]str=new String[10];//decleiar string
        for (int i=0;i<10;i++){
            System.out.print("Enter num = ");
            arr[i]=sc.nextInt(); //input array or integer
            sc.nextLine();//use this method to take input string after integer
            System.out.print("enter name = ");
            str[i]=sc.nextLine();   //input string
        }
        for (int i=0;i<10;i++){
            System.out.println(arr[i]);//print array
            System.out.println(str[i]);//print string
        }
    }
}
