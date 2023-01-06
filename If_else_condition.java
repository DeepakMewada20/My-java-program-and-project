//learn if else condition
import java.util.*;
class If_else_condition {
    int a,b,c;
    Scanner sc;
    void campare(){     //comparison function of 3 value
        sc=new Scanner(System.in);//object create of Scanner class
        System.out.printf("Enter a = ");///input value
        a=sc.nextInt();
        System.out.printf("Enter b = ");
        b=sc.nextInt();
        if(a>b){                        //condition
            System.out.printf("A is grater then B");
        }
        else{
            System.out.printf("B is grater then A");
        }
}
}
class If_else_condition_2{
    public static void main(String a[]){
        If_else_condition x1=new If_else_condition(); //object creation of If_else_condition class
        x1.campare();                                 // function calling
    }
}
