class X{
    int a=7;
    //constructor of X class
    X(){
        System.out.println("I am constructor of class X");
    }
    //function of X class
    void a(){
        System.out.println("value of a is = "+a);
    }
}
//class inheritance
class Y extends X {
    Y(){
        System.out.println("I am constructor of class Y");
    }
}

public class Constructer_inheritanc {

    public static void main(String[] args) {
        Y y=new Y();        //creart object
        //X x=new X();
        y.a=45;             //initilise value of a
        y.a();              //call class Y constructor
    }
}
