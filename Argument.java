//Argument in java
public class Argument {
    static void argument(int...a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("\naverage of argument is = "+(float)sum/a.length);
    }
    public static void main(String[] args) {
        argument(23,4,6,1,76,86,54);
    }
}
