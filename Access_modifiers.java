class C1{
    public int a=1;
    protected int b=2;
    int c=3;
    private int d=4;
    void use(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Access_modifiers {
    public static void main(String[] args) {
        C1 c=new C1();
        //c.use();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        //System.out.println(c.d);
    }
}
