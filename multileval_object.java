class X2{
    int a=9,b=82,c;
    void multi(){
        c=a*b;
        //we can use printf function in java like c
        System.out.printf("multi %d and %d is = %d",a,b,c);
    }
}
class Y2{
    public static void main(String a[]) {
        X2 x = new X2();
        new X2().multi();//------>second methade
    }
}
        //x1.multi();----->firs methade
        // hum dono me se kisi bhi methade ka use kar sakte hai,function ko call karne  ke liye