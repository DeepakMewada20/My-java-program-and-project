import java.util.*;
class Input_by_the_user {
    int a,b,c;
    Scanner sc;
    void multi(){
        sc=new Scanner(System.in);
        System.out.printf("Enter a = ");
        a=sc.nextInt();
        System.out.printf("Enter b = ");
        b=sc.nextInt();
        c=a*b;
        System.out.printf("multi %d and %d is = %d",a,b,c);
        
    }
}
class Input_by_the_user_2{
    public static void main(String a[]){
        Input_by_the_user x1=new Input_by_the_user();
        x1.multi();
    }
}
