//gest the random number
import java.util.*;
class Random_number_1 {
    int count=0;
     int Random_number_1() {
        Random r = new Random(); //object create of Random class
        return r.nextInt(100);//genreta random  number
//        compare();

    }
    //comparition function of random number
    void compare(){
        int num=Random_number_1();
        int user_number;
        Scanner sc=new Scanner(System.in);
        //do while loop
        do{
            count++;
            System.out.print("Enter number for gest = ");
            user_number=sc.nextInt(); //input by the user
            if(num==user_number){     //condition
                System.out.println("Number was mached");
            }
            else{
                if(user_number<num){
                    System.out.println("please enter grater number");
                }
                else {
                    System.out.println("Please enter smoll number");
                }
            }
        }while (num!=user_number);
        System.out.println("total "+count+" times you gest number");
    }

}
class Random_number{
    public static void main(String[] args) {
        Random_number_1 r1 = new Random_number_1(); //object create of Random_number_1 class
        r1.compare();                               //function call
    }
}

