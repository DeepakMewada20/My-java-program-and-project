class For_loop{
    int i;
    void loop(){        //this is function of For_loop class
        for(i=0;i<=9;i++){ //this is for loop
            i--;
            System.out.println("hello Computer "+i);
            i=i+2;
        }
    }
}
class For_loop_2{
    public static void main(String a[]){
        For_loop f1=new For_loop();         //object creation of class For_loop
        new For_loop().loop();              //function calling
    }
}