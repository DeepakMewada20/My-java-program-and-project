class Phone{
    void call(){        //this is function of class phone
        System.out.println("This id Phone calling...");
    }
    void music(){       //this is another function of class phone
        System.out.println("I am phone, ia am not play music");
    }
}
//class inheritance
class Smart_phone extends Phone{
    @Override
    void call(){//this is Override function
        System.out.println("This is Smart phone calling...");
    }
    void video(){       //This is function of Smart_phone class
        System.out.println("I am Smart Phone, I can play music");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj=new Smart_phone();//this is super class reference and sub call object
        obj.music();                  //this is function calling
    }
}
