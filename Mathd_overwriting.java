class A{
    int a;
    void mathad_1(){

        System.out.println("I am mathad of A class");
    }
}
class B extends A{
    @Override
    void mathad_1(){
        System.out.println("I am mathad of B class");
    }
}
public class Mathd_overwriting {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.mathad_1();
        b.mathad_1();
    }
}
