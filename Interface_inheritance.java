interface simpleInheritance{
    void method1();
    void method2();
}
interface childsimpleInterface extends simpleInheritance{
    void method3();
    void method4();
}
class My_simple_class implements childsimpleInterface{
    public void method3(){
        System.out.println("method3");
    }
    public void method4(){
        System.out.println("method4");
    }
    public void method1(){
        System.out.println("method 1");
    }
    public void method2(){
        System.out.println("method 2");
    }
}
public class Interface_inheritance {
    public static void main(String[] args) {
        My_simple_class m1=new My_simple_class();
        m1.method1();
    }
}
