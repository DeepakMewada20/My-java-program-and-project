public class Function_overloding {
    static void function_overloding(){
         System.out.println("This is function");
    }
    static void function_overloding(int a){
         System.out.println("the value of a = "+a);
    }
    static void function_overloding(int a,int b){
         System.out.println("the sum of a and b = "+(a+b));
    }
    public static void main(String[] args) {
        function_overloding();
        function_overloding(4);
        function_overloding(4,7);
    }
}
