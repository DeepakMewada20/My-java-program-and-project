class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    Base(){
        System.out.println("I am Base class constructor");
    }
    Base(int a){
        System.out.println("I am overlooded constructer of Base class, with a = "+a);
    }
}
class Drived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    Drived(){
        //super(9);
        System.out.println("I am Drived class constructor");
    }
    Drived(int a,int b){
        super(a);
        System.out.println("I an overlooded constructor of class Drived,with b = "+a+","+b);
    }
}
class Drived_child_class extends Drived{
    Drived_child_class(){
        System.out.println("I am Drived chile class constructor");
    }
    Drived_child_class(int a,int b,int c){
        super(a,b);
        System.out.println("I am Drived child class and overloded class, values of a,b,c = "+a+","+b+","+c);
    }
}
public class Constructor_inheritance {
    public static void main(String[] args) {
        //Base b=new Base();
//        Drived d=new Drived(6,45);
        Drived_child_class dc=new Drived_child_class(12,45,67);
    }
}