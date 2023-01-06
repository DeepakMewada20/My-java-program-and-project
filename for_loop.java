class For_loop{
    int i;
    void loop(){
        for(i=0;i<=9;i++){
            i--;
            System.out.println("hello Computer "+i);
            i=i+2;
        }
    }
}
class For_loop_2{
    public static void main(String a[]){
        For_loop f1=new For_loop();
        new For_loop().loop();
    }
}