class Thread_Constructer extends Thread{
    Thread_Constructer(String name){
        super(name);
    }
    public void run(){
        System.out.println("This is run method of Thread");
    }
}
public class Constructer_in_thread {
    public static void main(String[] args) {
        Thread_Constructer tc =new Thread_Constructer("Deepak");
        Thread t1=new Thread(tc,"mewada");
        System.out.println("Name of Thread is = "+ tc.getName());
        System.out.println("Id of Thread is = "+tc.threadId());
        t1.start();
        System.out.println("Name of Thread is = "+ t1.getName());
        System.out.println("Id of Thread is = "+t1.threadId());
        System.out.println(t1.getState());
        System.out.println(t1.toString());
        System.out.println(t1.getThreadGroup());
        System.out.println(t1.getContextClassLoader());
        System.out.println(t1.getPriority());
        System.out.println(t1.getStackTrace());
        System.out.println(t1.isAlive());
    }
}
