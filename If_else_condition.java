import java.util.*;
class If_else_condition {
    int a,b,c;
    Scanner sc;
    void campare(){
        sc=new Scanner(System.in);
        System.out.printf("Enter a = ");
        a=sc.nextInt();
        System.out.printf("Enter b = ");
        b=sc.nextInt();
        if(a>b){
            System.out.printf("A is grater then B");
        }
        else{
            System.out.printf("B is grater then A");
        }
}
}
class If_else_condition_2{
    public static void main(String a[]){
        If_else_condition x1=new If_else_condition();
        x1.campare();
    }
}
