public class Variable_arguments {
    static int variable_argument(int...arr){  //this is argument function
        int result=0;
            for (int a : arr) {         //for each loop
                result += a;            //adding all number or arguments
            }
            System.out.print("sum of ");
            for (int a : arr) {         //for each loop
                System.out.print(a + "+");
            }
            System.out.println(" = " + result);
        return 0;
    }
    public static void main(String[] args) {
        variable_argument();                //pass arguments
        variable_argument(3);
        variable_argument(3,4);
        variable_argument(2,6,4);
        variable_argument(54,78,90,1);
    }
}
