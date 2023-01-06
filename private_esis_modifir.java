//esis
import java.util.Scanner;
class Employ{
    int id ;
    String name;
    Scanner sc=new Scanner(System.in);
    void set_deta(){
        System.out.print("Enter emaploy ID = ");
        id=sc.nextInt();
        System.out.print("Emaploy name = ");
        name=sc.nextLine();
    }
    void get_data(){
        System.out.println("employ id = "+id);
        System.out.println("employ name = "+name);
    }
}
public class private_esis_modifir {
    public static void main(String[] args) {
        Employ e1=new Employ();
        e1.set_deta();
        e1.get_data();
    }
}
