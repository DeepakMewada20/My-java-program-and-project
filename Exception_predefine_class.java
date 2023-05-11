import java.util.Scanner;

class Exception1 extends Exception {
    @Override
    public String getMessage() {
        return "I am Get message";
    }
    @Override
    public String toString()  {
        return "I am toString";
    }
}
public class Exception_predefine_class {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter a = ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<10){
            try {
                throw new Exception1();
                //throw new ArithmeticException("This is Exception");//we can also throw Exception ot this type
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
