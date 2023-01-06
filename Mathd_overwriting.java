class A{
    int a;
    void mathad_1(){

        System.out.println("I am mathad of A class");
    }
}
class B extends A{
    @Override
    //Override function
    void mathad_1(){
        System.out.println("I am mathad of B class");
    }
}
public class Mathd_overwriting {
    //main function
    public static void main(String[] args) {
        A a=new A();        //object creation of A class
        B b=new B();        //object creation of b class
        a.mathad_1();       //call method of A class
        b.mathad_1();       //call method of B class
    }
}
