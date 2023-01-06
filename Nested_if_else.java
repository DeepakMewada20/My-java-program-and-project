//nested if else condition
import java.util.*;
class Nested_if_else {
    int a,b,c;
    void campare(){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter a = ");
        a=sc.nextInt();
        System.out.printf("Enter b = ");
        b=sc.nextInt();
        System.out.printf("Enter c = ");
        c=sc.nextInt();
        //Nested if else
        if(a>b){
            if(a>c){
                System.out.println("a is grater then b and c");
            }
            else{
                System.out.println("c is grater then a and b");
            }
        }
        else {
            if(b>c){
                System.out.println("b is grater then a and c");
            }
            else {
                System.out.println("c is greater then a and b");
            }
        }
    } 
}
class Nested_if_else_2{
    public static void main(String a[]){
        Nested_if_else d1=new Nested_if_else();
        d1.campare();
    }
}
