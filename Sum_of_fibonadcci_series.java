public class Sum_of_fibonadcci_series {

    static int recarsive_fib(int n){
        int f=0;
        if (n==1){
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else {
            return f=recarsive_fib(n-1)+recarsive_fib(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.print("sum of febonacci series = "+recarsive_fib(8));
    }
}
