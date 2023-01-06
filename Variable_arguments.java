public class Variable_arguments {
    static int variable_argument(int...arr){
        int result=0;
//        int a;
            for (int a : arr) {
                result += a;
            }
            System.out.print("sum of ");
            for (int a : arr) {
                System.out.print(a + "+");
            }
            System.out.println(" = " + result);
        return 0;
    }
    public static void main(String[] args) {
        variable_argument();
        variable_argument(3);
        variable_argument(3,4);
        variable_argument(2,6,4);
        variable_argument(54,78,90,1);
    }
}
