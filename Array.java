import java.util.Scanner;
//inport scanner class
public class Array {
    public static void main(String[] args) {
        int[] marks=new int[5];                         //declertion of array
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<marks.length;i++){               //input array
            System.out.print("Enter "+(i+1)+" st student marks = ");
            marks[i]=sc.nextInt();
        }
        for (int i=0;i<marks.length;i++){               //display of array
            System.out.println("Marks of "+(i+1)+" st Student = "+marks[i]);
        }
    }
}
