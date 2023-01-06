//inheritance in java
class Perant{
    public int x=34,y=67;
    void print(){
        System.out.println("value of x = "+x+"and y = "+y);

    }
}
//class inheritance
class Child extends Perant{
    void print_x(){
        System.out.println("value of x = "+x);
        System.out.println("value of y = "+y);
        x=223;              //also change value of x of in this class
    }
    void print_new_x(){
        System.out.println("new x is = "+x);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Perant p=new Perant();      //object creation of perant class
        Child c=new Child();        //object creation of child class
        c.print_x();
        c.print_new_x();
        c.y=5;                      //also change value of perant class, help of child object
        c.print();

    }
}
