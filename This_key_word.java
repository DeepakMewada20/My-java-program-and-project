class Aa {
    int a=0;
   //this is getter and setter
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
        this(); //this key word first call privies Aa constructor
        System.out.println("This is overloded constrecter of class X and value of b = "+b);
    }

}
public class This_key_word {
    void This(){        //first method of This key word
        System.out.println("value of \"This\" key word of class This_key_word = "+this);
        //this key word hole default similler value of this class object
    }
    public static void main(String[] args) {
        This_key_word th=new This_key_word(); // object create of  This_key_word class and object name is "th".
        th.This();
        System.out.println("value of \"object\" of class This_key_word = "+th);
        Aa x1=new Aa(34);
        x1.setA(50);
        System.out.println("the value of a = "+x1.getA());
    }
}
