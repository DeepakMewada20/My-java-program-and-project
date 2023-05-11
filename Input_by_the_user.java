//input by the user in java
import java.util.*;
class Input_by_the_user {
    int a,b,c;
    Scanner sc;
    void multi(){
        sc=new Scanner(System.in);//object creation of class Scanner
        System.out.printf("Enter a = ");
        a=sc.nextInt();           //input by user
        System.out.printf("Enter b = ");
        b=sc.nextInt();
        c=a*b;
        System.out.printf("multi %d and %d is = %d",a,b,c);
        
    }
}
class Input_by_the_user_2{
    public static void main(String a[]){
        Input_by_the_user x1=new Input_by_the_user(); //object creation of Input_by_the_user class
        x1.multi();                                   //function calling
    }
}
