import java.util.Scanner;

class Cylinder{
     private float height;
     private float reduis;
     private double volum;
     private double serface_arae;
     Cylinder(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height of cylinder = ");
        height=sc.nextFloat();
        System.out.print("Enter reduis of cylinder = ");
        reduis=sc.nextFloat();
//        calculat();
     }
    public void get(){
        System.out.println("volum of cyliader is = "+volum);
        System.out.println("serface area of cylinder is = "+serface_arae);
    }
    public void calculat(){
        volum=3.14*reduis*reduis*height;
        serface_arae=2*3.14*reduis*(reduis+height);
        get();
    }
}

public class Chapter_9_prectic_set {
    public static void main(String[] args) {
         new Cylinder();
//        c1.set();
        new Cylinder().calculat();
//        c1.get();
    }
}
