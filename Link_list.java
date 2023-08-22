import  java.util.*;
public class Link_list {
    public static void main(String[] args) {
        LinkedList list=new LinkedList<>();
        LinkedList<Integer> list2=new LinkedList<>();
        list.add(4);
        list.add(6);
        list.add('r');
        list.add(44);
        list.add(7);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(4);
        System.out.println(list);

        list.addLast(54);    //add element in last in list
        System.out.println(list);

        list.addFirst("adf");  //add element in first in list
        System.out.println(list);

        list.poll();             //retrieves and remove first element
        System.out.println(list);

        System.out.println(list.peek());  //retrieves first element, and if list is empty return NULL.

        System.out.println(list.peekLast());//return last element of list, if lis is empty return null.

        System.out.println(list.pop()); //
        System.out.println(list);

        list.push(67);
        System.out.println(list);

        list.remove(); //remove first element of list
        System.out.println(list);

        list.removeFirstOccurrence(4);  //remove last element occurrence in list
        System.out.println(list);

        list.removeFirstOccurrence(7);
        System.out.println(list);

        System.out.println(list.getFirst());  //return first element of list, but if list is empty throw exception and program termineted.

        System.out.println(list.getLast());   //return last element of list.
    }
}
