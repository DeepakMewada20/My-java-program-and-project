class Mythread1 extends Thread{
    @Override
    public void run(){
        System.out.println("this is thread 1");
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        System.out.println("this is thread 2");
    }
}
public class Thread_cwh {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();
    }
}
