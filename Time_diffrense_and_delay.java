import java.util.*;
public class Time_diffrense_and_delay {
    public static void main(String[] args) {
        try {
            long start=System.currentTimeMillis();
            System.out.println(new Date());
            Thread.sleep(10000);
            System.out.println(new Date());
            long end=System.currentTimeMillis();
            System.out.println("Total time diffrense = "+(end-start));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
