public class Finally_book {
    static int divid() {
        int a=8;
        int b=0;
        try {
           int c=a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This is end of function");
            System.out.println("finally bool me hum vo likhat hai jo hame har haal me exzicut carvana hota hai");
        }
        return -1;
    }
    public static void main(String[] args) {
        int ans=divid();
        System.out.println(ans);
    }
}
