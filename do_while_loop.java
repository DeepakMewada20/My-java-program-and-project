class Do_while{
    int i=0;
    void loop(){
        do{
            System.out.println("hello my friend...");
            i++;
        }while(i<=6);
    }
}


class Do_while_2{
    public static void main(String a[]){
        Do_while d1=new Do_while();
        d1.loop();
    }
}