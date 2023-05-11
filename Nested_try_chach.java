import java.util.Scanner;

public class Nested_try_chach {
    public static void main(String[] args) {
        int[] arr =new int[5];
        arr[0]=34;
        arr[1]=65;
        arr[2]=54;
        arr[3]=89;
        arr[4]=90;
        Scanner sc=new Scanner(System.in);
        int index,num;
        boolean flag=true;
        while (flag){
            System.out.print("Enter index of arr, jesme app bhag dena chahte hai = ");
            index=sc.nextInt();
            System.out.print("Enter number, jisse app bhag dena chahte hai = ");
            num=sc.nextInt();
            try {
                System.out.println("the value at array index entered is = "+arr[index]);
                //flag=false;
                try {
                    System.out.println("the value, after divition of this value = "+(arr[index]/num));
                    flag=false;
                }
                catch (ArithmeticException e){
                    System.out.println(e);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                //System.out.println("This is Arithmetic Exception");
                System.out.println(e);
            }
        }

    }
}
