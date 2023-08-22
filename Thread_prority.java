import java.lang.String;
class Thread_proirity extends Thread{
    Thread_proirity(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while (true) {
            System.out.println("name of treada = " + this.getName());
        }
    }
}
public class Thread_prority {
    public static void main(String[] args) {
        Thread_proirity tc1 =new Thread_proirity("Deepak1");
        Thread_proirity tc2 =new Thread_proirity("Deepak2");
        Thread_proirity tc3 =new Thread_proirity("Deepak3");
        Thread_proirity tc4 =new Thread_proirity("Deepak4");
        Thread_proirity tc5 =new Thread_proirity("Deepak5 (Most importent)");
        tc5.setPriority(Thread.MAX_PRIORITY);
        tc1.setPriority(Thread.MIN_PRIORITY);
        tc2.setPriority(Thread.MIN_PRIORITY);
        tc3.setPriority(Thread.MIN_PRIORITY);
        tc4.setPriority(Thread.MIN_PRIORITY);
        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        tc5.start();
    }
}
