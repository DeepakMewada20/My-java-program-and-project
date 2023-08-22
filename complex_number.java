import java.util.*;
import java.lang.String;
public class complex_number {
    public static void main(String[] args) {
        int a,b,c;
        char ch;
        String str;
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter a = ");
        a=sc.nextInt();
        System.out.printf("Enter b = ");
        b=sc.nextInt();
        System.out.printf("Enter c = ");
        c=sc.nextInt();
        System.out.printf("Enter string = ");
        str=sc.next();
        ch=str.charAt(3);
        System.out.println((a-b)/2);
        System.out.println(((b*b)-(4*a*c))/(2*a));
        System.out.println((a*a)-(b*b));
        System.out.println(a*b-c);
        System.out.println((char)('b'+5));
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(++a*5);
        System.out.println((a++)*5);
        System.out.println(++ch);
    }
}
