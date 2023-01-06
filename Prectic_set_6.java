import java.util.Scanner;

public class Prectic_set_6 {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for search = ");
        int n=sc.nextInt();
        int i;
        boolean t=false;
        for ( i=0;i<arr.length;i++){
            if(n==arr[i]){
                t=true;
                break;
            }
        }
        if(t){
            System.out.println("Index of this element is "+i);
        }
        else {
            System.out.println("element not found");
        }
        int minimum=arr[0],meximum=arr[0];
        for( i=1;i<arr.length;i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }
        for( i=1;i<arr.length;i++) {
            if (meximum < arr[i]) {
                meximum = arr[i];
            }
        }
           /* for (int j = (i + 1); j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }*/
        System.out.print("your arr is = ");
        for (i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.print("\n");
        System.out.print("smolest element of array = ");
        System.out.println(minimum);
        System.out.print("largest element of array = ");
        System.out.println(meximum);
        int j=arr.length;
        int temp;
        for (i=0;i<=j;i++){
            for (j=(arr.length-(i+1));j>=i;j--){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                break;
            }
        }
        System.out.print("your reveres array is = ");
        for (int element:arr){
            System.out.print(" "+element);
        }
        int sort=arr[0];//this program show arr sorted or not
        //sort veriabal store arr[0]
        t=false;
        for (i=1;i<arr.length;i++){
            if(sort>arr[i]){
                t=true;
                break;
            }
            sort=arr[i];
        }
        if (t){
            System.out.println("array is not sorted");
        }
        else {
            System.out.print("array is soretd");
        }
    }
}
