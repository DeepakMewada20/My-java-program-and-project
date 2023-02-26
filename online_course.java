public class online_course {
    public static void main(String[] args) {
        int mark=5;
        int grace=2;
        int total=mark+(mark>6?grace:--grace);
        System.out.print(total);
    }
}
