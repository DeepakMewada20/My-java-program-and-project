import java.util.*;
public class Time_difference_and_delay {
    public static void main(String[] args) {
        try {
            long start=System.currentTimeMillis(); //start is veriabal and it stores cornet time
            System.out.println(new Date());        //print cornet date and tine
            Thread.sleep(10000);              //delay of 10000 mili second
            System.out.println(new Date());         //print cornet date and time of after 10000 milis second
            long end=System.currentTimeMillis();     //end is another veriabal and it stores cornet time
            System.out.println("Total time difference = "+(end-start)); //difference  of start and end timing
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
