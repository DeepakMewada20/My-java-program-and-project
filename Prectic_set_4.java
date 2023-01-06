import java.util.Scanner;

public class Prectic_set_4 {
    public static void main(String[] args) {
        long selery=500000;
       /* if(a=11){
            System.out.println("i am 11");
        }
        else {
            System.out.println("i am not 11");
        }*/
        //q -->2
        float tex;
        if((selery>=250000)&&(selery<=500000)){
            tex=(float)(selery*5)/100;
            System.out.println("tex is 5% and  ka 5% = "+tex);
        }
        else if((selery>=500000)&&(selery<=1000000)){
            tex=(float) (selery*20)/100;
            System.out.println("tex is 20% and ka 5% = "+tex);
        }
        else {
            tex=(float) (selery*30)/100;
            System.out.println("tex is 30% and  ka 5% = "+tex);
        }
        //q-->4
        String extention;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter extention with dote= ");
        extention=sc.next();
        //System.out.println(extention);
        switch (extention){
            case ".com"->System.out.println("Commercial");
            case ".in"->System.out.println("india");
            case ".org"->System.out.println("Orgnization");
            case ".net"->System.out.println("Network");
            case ".int"->System.out.println("Internatinal Orgnizatone");
            case ".gov"->System.out.println("U.S. Fed & State Gov. Agencies");
            case ".arpa"->System.out.println("Address & Routing Parameter Area");
            case ".edu"->System.out.println("U.S. Higher Education");
            default -> System.out.println("enter catect extention");
        }
    }
}
