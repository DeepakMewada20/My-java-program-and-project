import java.util.ArrayDeque;
import  java.lang.String;
public class Array_dequeue {
    public static void main(String[] args) {
        ArrayDeque arr=new ArrayDeque();
        ArrayDeque arr1=new ArrayDeque();
        arr.add(54);
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(54);
        arr.add(23);
        arr.add(78);
        arr.add(3);
        System.out.println(arr);

        arr1.add(54);
        arr1.add(13);

        arr.addAll(arr1);
        System.out.println(arr);


        arr.addFirst(89);
        System.out.println(arr);

        arr.addLast(90);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);

        arr.removeFirstOccurrence(3);
        System.out.println(arr);

        arr.removeLastOccurrence(54);
        System.out.println(arr);

    }
}
