class While_loop{
    int i=0;
    void loop(){    //this is function
        while(i<=5){  //this is while loop
            System.out.println("hello my friend...");
            i++;
        }
    }
}
class While_loop_2{
    public static void main(String a[]){
        While_loop w1=new While_loop(); //object create of While_loop class
        w1.loop();                      //function call
    }
}