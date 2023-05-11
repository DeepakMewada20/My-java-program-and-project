//print parten by recursion
public class partan {
    //recursion function
    static void partern(int n){
        if (n>0){
//            partern(n-1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
            partern(n-1);
        }
    }

    public static void main(String[] args) {
        partern(6);//function calling
    }
}
