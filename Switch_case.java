import java.util.*;
class Switch_case{
    int n;
    Scanner sc;
    void switch_case1(){
        sc=new Scanner(System.in);
        System.out.printf("Enter number, between 1 to 5 = ");
        n= sc.nextInt();
        switch (n){
            case 1:{
                System.out.println("Deepak ji Mewada");
                break;
            }
            case 2:{
                System.out.println("Shivam dwivedi");
                break;
            }
            case 3:{
                System.out.println("Payal sangitla");
                break;
            }
            case 4:{
                System.out.println("Aditya parjapti");
                break;
            }
            case 5:{
                System.out.println("Anushka");
                break;
            }
            default:{
                System.out.println("jab upar likha hai 1 to 5 to ku dimag laga raha hai");
                break;
            }
        }
    }
}
class Switch_case_2{
    public static void main (String a[]){
        Switch_case d1=new Switch_case();
        d1.switch_case1();
    }
}