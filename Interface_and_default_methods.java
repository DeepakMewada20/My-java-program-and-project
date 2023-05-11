interface Mycamera{
    void takesnep();//en method ko implement karna is complsary
    void recordmusic();
    default void recork4kvideo(){//default method ese kisi bhi class me implement karna jaruri nahi hai ager app cahe to implement kar sakte hai
        setting();
        System.out.println("record 4k video");
    }
    //private method ese bahar se call nahi kar sakte hahi ke method use kar sakty hai
    private void setting(){
        System.out.println("choice setting");
    }
}
interface Mywifi{
    String[] wifiname();
    void conecttonetwork(String name);
}
class Cellphone{
    void callnumber(int number){
        System.out.println("colling "+number);
    }
    void pickcall(){
        System.out.println("conected");
    }
}
class Smartphone extends Cellphone implements Mycamera,Mywifi{
    public void takesnep(){
        System.out.println("snep is rady");
    }
    public void recordmusic(){
        System.out.println("your music is recored");
    }
    public String[] wifiname() {
        System.out.println("network list");
        String[] networklist={"vivo","oppo","realme"};
        return networklist;
    }
    public void conecttonetwork(String name){
        System.out.println("conected network is "+name);
    }

    @Override
    public void recork4kvideo() {
        System.out.println("this fecure record 4k video qality and this is Override method");
        Mycamera.super.recork4kvideo();
    }
}
public class Interface_and_default_methods {
    public static void main(String[] args) {
        Smartphone sp=new Smartphone();
        sp.recork4kvideo();
        //sp.setting(); hum esa nahi kar sakte
        String[] arr=sp.wifiname();
        for (String name:arr){
            System.out.println(name);
        }
    }
}
