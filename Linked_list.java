class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Linked_list {
    Node head=null;
    public void addfirst(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
        }
        else {
            newnode.next = head;
            head = newnode;
        }
    }
    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else {
           Node start = head;
           while (start.next!=null){
               start=start.next;
           }
           start.next=newnode;
        }
    }
    public void addcenter(int data){

    }
    public void print(){
        if (head==null){
            System.out.println("empty");
        }
        else {
            Node start=head;
            while (start!=null){
                System.out.println(start.data);
                start=start.next;
            }
        }
    }
    public static void main(String[] args) {
        Linked_list list=new Linked_list();
        //Node head=null;
        list.addfirst(55);
        list.addfirst(9);
        list.addlast(90);
        list.addfirst(1);
        list.print();
        //while (head!=null){

    }
}
