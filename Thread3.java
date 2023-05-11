import java.lang.Thread;//not neccesary to import Thread package
class Thread1 extends Thread {
    Thread t1,t2;
    Thread1(){
        t1=new Thread(this,"one");
        t2=new Thread(this,"two");
        t1.start();
        t2.start();
    }
    @Override
    public void run(){
        int i=0;
        if (Thread.currentThread()==t1){
            while (i<50){
                System.out.println("Deepak Mewada");
                i++;
             }
        }
        if(Thread.currentThread()==t2){
            while (i<50){
                System.out.println("i am deepak mewada");
                i++;
            }
        }
    }
    }
public class Thread3 {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        //t1.start();
    }
}
