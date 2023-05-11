class Thread_method1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<4){
            System.out.println("Thank you...");
            i++;
        }
    }
}
class Thread_method2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<5){
            System.out.println("Thank you so much ...");
            i++;
        }
    }
}
public class Thread_Method {
    public static void main(String[] args) {
        Thread_method1 tm1=new Thread_method1();
        Thread_method2 tm2=new Thread_method2();
        tm1.setPriority(1);
        System.out.println(tm1.getPriority());
        System.out.println(tm1.getState());
        tm1.start();
        System.out.println(tm1.getState());
        try {
            Thread.sleep(400);
        }
        catch (Exception e){
            System.out.println(e);
        }
//        try {// second method of Thread , first method tm1 complet then second method tm2 is start
//            tm1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        System.out.println(tm1.getState());
        tm2.start();
        System.out.println(Thread.currentThread());
    }
}
