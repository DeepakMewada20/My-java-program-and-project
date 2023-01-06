public class Method {
     int sum(int a,int b){
        return a+b;
    }
    static void array(int [] arr){
         arr[3]=67;
//         for (int element:arr)
//         System.out.print(element+" ");
    }
    static int function_overloding(){
         System.out.println("hellow Deepak JI Mewada");
         return 0;
    }
    static int function_overloding(int a){
         System.out.println("the value of a = "+a);
         return a;
    }
    static int function_overloding(int a,int b){
         System.out.println("the sum of a and b = "+(a+b));
         return a+b;
    }
    public static void main(String[] args) {
        Method m1=new Method();
        int[] arr={3,6,5,9,2};
        System.out.println("the value of c = "+m1.sum(2,5));
        array(arr);
        for(int element:arr) {
            System.out.print(element+" ");
        }
        System.out.println();
        function_overloding();
        function_overloding(4);
        System.out.println(function_overloding(6));
        function_overloding(4,7);
        System.out.println(function_overloding(7,9));
    }
}
