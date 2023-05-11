interface Vehical { //interface
    final int a=34;//final lagane ki jarurat nahi hai kayo ki interface ki koi bhi proparty change nahi kar sakte hai
    void horn();//method
    void speed(int s);//method
}
interface bycical{//second interface
    void light();//interface method
}
class Cycle implements Vehical{//create class "Cycle" and implement vehical
    @Override
    public void horn(){//implement horn method of interface
        System.out.println("pe pe pe pe ");
    }
    @Override
    public void speed(int s){//implement speed method of interface
        System.out.println("Speed is = "+s);
    }
}
//create motercycle class ,and inherit Cycle class and inplement vehical and becical
class motercycle extends Cycle implements Vehical,bycical{
    @Override
    public void horn(){//implement horn method of interface
        super.horn();//this keyword call first method of perent class ya upper vali class ki
        System.out.println("this is Motercycle and hore is po po po po ");
    }
    @Override
    public void speed(int s){//implement speed method of interface
        System.out.println("This is Motercycle and net speed of it is = "+s);
    }
    //this is bycical interface method and Override method
    @Override
    public void light(){
        System.out.println("On light");
    }
}
class Interface{
    public static void main(String[] args) {
        motercycle m1=new motercycle();//create object
        m1.horn();
        m1.speed(7);
        m1.light();
    }
}
