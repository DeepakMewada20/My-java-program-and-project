import java.util.ArrayDeque;

public class Array_dequeue {
    public static void main(String[] args) {
        ArrayDeque arr=new ArrayDeque();
        arr.add(54);
        arr.add(5);
        arr.add(23);
        System.out.println(arr.descendingIterator());

        arr.descendingIterator();
    }
}
