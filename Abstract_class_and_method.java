abstract class Perent1{//Abstract class
    Perent1(){//Constrecter
        System.out.println("I am a constractur of perent class");
    }
    void say_hello(){//another method of perent1 class
        System.out.println("Hello!");
    }
    abstract void great();//Abstract method
}
class Child1 extends Perent1{//inheritence
    Child1(){//Constracter
        System.out.println("I am a condtructer of Child chall");
    }

    @Override//Override method of abstract method of perent1 class,
    void great() {
        System.out.println("good Morning");
    }
}
abstract class Child3 extends Perent1{
    @Override
    void great() {
        System.out.println("Good night");
    }
}

public class Abstract_class_and_method {
    public static void main(String[] args) {
        Perent1 c1=new Child1();//Allowed
        Child1 c2=new Child1();//Allowed
        //Perent1 p=new Perent1();//not allowed
        c1.great();
    }
}
