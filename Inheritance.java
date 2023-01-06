class Perant{
    int x=34,y=67;
    void print(){
        //System.out.println("Deepak");
        System.out.println(x+" "+y);

    }
}
class Child extends Perant{
    void print_x(){
        System.out.println("the value of x = "+x);
        System.out.println("the value of y = "+y);
        x=223;
    }
    void print_new_x(){
        System.out.println("new x is = "+x);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Child c=new Child();
        Perant p=new Perant();
//        c.print();
        c.print_x();
        c.print_new_x();
        p.y=5;
        c.print();

    }
}
