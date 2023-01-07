//find PERCENTAGE of mark in java
import java.util.*;
public class Find_percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte n,mark;
        int total_number=0;
        float percentage;
        System.out.println("Find PERCENTAGE");
        System.out.print("How many subject, Enter number = ");
        n= sc.nextByte();
        for(int i=0;i<n;i++){
            System.out.printf("Enter %dst subject mark = ",i+1);
            mark=sc.nextByte();
            total_number+=mark;// total number of mark
        }
        percentage=(float) total_number/n; //find percentage of mark
        System.out.println("percentage of total number is = "+percentage);
        
    }
}
