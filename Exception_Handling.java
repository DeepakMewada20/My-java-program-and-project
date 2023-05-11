import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        int[] arr =new int[5];
        arr[0]=34;
        arr[1]=65;
        arr[2]=54;
        arr[3]=89;
        arr[4]=90;
        Scanner sc=new Scanner(System.in);
        int index,num;
        System.out.print("Enter index of arr, jesme app bhag dena chahte hai = ");
        index=sc.nextInt();
        System.out.print("Enter number, jisse app bhag dena chahte hai = ");
        num=sc.nextInt();
        try {
            System.out.println("the value at array index entered is = "+arr[index]);
            System.out.println("the value, after divition of this value = "+(arr[index]/num));
        }
        catch (ArithmeticException e){
            System.out.println("This is Arithmetic Exception");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is array out of bound Exception");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
