class Base{
    //constructor of Base class
    Base(){
        System.out.println("I am Base class constructor");
    }
    //overloded constructor of Base class
    Base(int a){
        System.out.println("I am overlooded constructor of Base class, with a = "+a);
    }
}
//class inheritances
class Drived extends Base{
    //constructor of Drived class
    Drived(){
        //super(9);
        System.out.println("I am Drived class constructor");
    }
    //overloded constructor of Drived class
    Drived(int a,int b){
        super(a);
        System.out.println("I an overlooded constructor of class Drived,with b = "+a+","+b);
    }
}
//class inheritance
class Drived_child_class extends Drived{
    //constructor of Drived_child_class class
    Drived_child_class(){
        System.out.println("I am Drived chile class constructor");
    }
    //overloded constructor of Drived_child_class class
    Drived_child_class(int a,int b,int c){
        super(a,b);
        System.out.println("I am Drived child class and overloded class, values of a,b,c = "+a+","+b+","+c);
    }
}
public class Constructor_inheritance {
    public static void main(String[] args) {
        Drived_child_class dc=new Drived_child_class(12,45,67);//object creation and call constructor
    }
}