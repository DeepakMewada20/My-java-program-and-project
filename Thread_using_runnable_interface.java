//import java.lang.*;
class Runnable_thread1 implements Runnable{
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("This is Runnable thread 1");
            i++;
        }
    }
}
class Runnable_thread2 implements Runnable{
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("This is Runnable thread 2");
            i++;
        }
    }
}
public class Thread_using_runnable_interface {
    public static void main(String[] args) {
        Runnable_thread1 rt1=new Runnable_thread1();
        Runnable_thread2 rt2=new Runnable_thread2();
        Thread t1 = new Thread(rt1);
        Thread t2 = new Thread(rt2);
        t1.start();
        t2.start();
    }

}
