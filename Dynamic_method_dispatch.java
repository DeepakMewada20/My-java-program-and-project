class Phone{
    void call(){
        System.out.println("This id Phone calling...");
    }
    void music(){
        System.out.println("I am phone, ia am not play music");
    }
}
class Smart_phone extends Phone{
    @Override
    void call(){
        System.out.println("This is Smart phone calling...");
    }
    void video(){
        System.out.println("I am Smart Phone, I can play music");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj=new Smart_phone();//this is super class reference and sub call object
        obj.call();
    }
}
