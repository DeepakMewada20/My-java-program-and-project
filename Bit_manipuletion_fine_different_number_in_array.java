import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Bit_manipuletion_fine_different_number_in_array {
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,6,7,8,8,7,6,9,2,9,2,4};
        List<Integer> count_one=new ArrayList<>();
        //find large number of array
        int large_number= Arrays.stream(arr).max().getAsInt();
        System.out.println(large_number);
        while (large_number>0){
            int one=0;
            for (int i=0;i<arr.length;i++){
                int last=arr[i]&1;
                if(last==1){
                    one++;
                }
                arr[i]=arr[i]>>1;
                //System.out.print(" "+arr[i]);
            }
            large_number=large_number>>1;
            count_one.add(one%2);
        }
        System.out.println(count_one.size());
        for (int i=0;i< count_one.size();i++) {
            System.out.print(count_one.get(i));
        }
        System.out.println();
        for (int i:count_one) {
            System.out.print(i);
        }
        double number=0;
        for (int i:count_one){
            number=number+Math.pow(2,i)*count_one.size()-i;
        }
        System.out.println(number);
    }
}
