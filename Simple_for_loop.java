class Simple_for_loop{
    int i;
    void loop(){         //this is function
        for(i=0;i<=5;i++){ //this is for loop
            System.out.println("hello world! ");
        }
    }
}
class Simple_for_loop_2{
    public static void main(String a[]){
        Simple_for_loop f1=new Simple_for_loop(); //object create of Simple_for_loop class
        new Simple_for_loop().loop();             //function call by object
    }
}