class Aa {
    int a=0;

    int getA() {
        return a;
    }

    void setA(int a) {
        this.a = a;
    }

    Aa(){
        System.out.println("This is constrectur of class X");
    }
    Aa(int b){
        this();
        System.out.println("This is overloded constrecter of class X and value of b = "+b);
    }

}
public class This_key_word {
    void This(){
        System.out.println("value of \"This\" key word of class This_key_word = "+this);

    }
    public static void main(String[] args) {
        This_key_word th=new This_key_word();
        th.This();
        System.out.println("value of \"object\" of class This_key_word = "+th);
        Aa x1=new Aa(34);
        x1.setA(50);
        System.out.println("the value of a = "+x1.getA());
    }
}
