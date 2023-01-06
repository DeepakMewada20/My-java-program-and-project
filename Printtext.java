import java.util.*;
class XX{
    int a,b,c;
    String s1,s2;
    String str="My name is deepak Mewada";
    void sum(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a = ");
        a=input.nextInt();
        System.out.print("Enter b = ");
        b=input.nextInt();
        c=a+b;
        System.out.printf("sum of %d and %d = %d",a,b,c);
        System.out.println("your = "+str);
        System.out.print("Enter s1 = ");
        s1=input.next();
        System.out.print("Enter s2 = ");
        s2=input.next();
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
    }
}
class YY{
    public static void main(String a[]){
        XX x1=new XX();
        x1.sum();
    }
}
