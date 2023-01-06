class While_loop{
    int i=0;
    void loop(){
        while(i<=5){
            System.out.println("hello my friend...");
            i++;
        }
    }
}
class While_loop_2{
    public static void main(String a[]){
        While_loop w1=new While_loop();
        w1.loop();
    }
}