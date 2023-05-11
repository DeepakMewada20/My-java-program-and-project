class Do_while{
    int i=0;
    void loop(){ //this is function
        do{      //start do while loop
            System.out.println("hello my friend...");
            i++;   //incretion/decretion
        }while(i<=6);//condition
    }
}


class Do_while_2{
    public static void main(String a[]){
        Do_while d1=new Do_while();//creation of object
        d1.loop();                  //calling of function
    }
}