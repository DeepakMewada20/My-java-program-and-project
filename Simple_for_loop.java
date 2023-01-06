class Simple_for_loop{
    int i;
    void loop(){
        for(i=0;i<=5;i++){
            System.out.println("hello world! ");
        }
    }
}
class Simple_for_loop_2{
    public static void main(String a[]){
        Simple_for_loop f1=new Simple_for_loop();
        new Simple_for_loop().loop();
    }
}