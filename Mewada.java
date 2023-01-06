import java.util.*;
public class Mewada {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte n,mark;
        int total_number=0;
        float sgpa,percentage;
        System.out.println("Find SGPA and PERCENTAGE");
        System.out.print("How many subject, Enter number = ");
        n= sc.nextByte();
        for(int i=0;i<n;i++){
            System.out.printf("Enter %dst subject mark = ",i+1);
            mark=sc.nextByte();
            total_number=total_number+mark;
        }
        percentage=total_number/5;
        
    }
}
