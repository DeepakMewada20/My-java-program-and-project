class X{
    int a=7;
    X(){
        System.out.println("I am constructor of class X");
    }
    void a(){
        System.out.println("value of a is = "+a);
    }
}
class Y extends X {
    Y(){
        System.out.println("I am constructor of class Y");
    }
}

public class Constructer_inheritanc {

    public static void main(String[] args) {
        Y y=new Y();
        //X x=new X();
        y.a=45;
        y.a();
    }
}
