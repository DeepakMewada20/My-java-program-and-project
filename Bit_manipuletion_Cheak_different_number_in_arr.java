public class Bit_manipuletion_Cheak_different_number_in_arr {
    public static void main(String[] args) {
        int arr[]={6,1,4,3,77,1,3,4,6,77,8};
        int number=0;
        for (int i: arr) {
            number=number^i;
        }
        System.out.println(number);
    }
}
