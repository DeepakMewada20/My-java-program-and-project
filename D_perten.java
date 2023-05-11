//this program print D parten
//this is pertan class
class Perten{
    int n=10;
    void perten(){
        for(int i=0;i<n;i++){
            if((i==0)||(i==(n-1))){
                System.out.println("D");
            }
            else {
                System.out.print("D");
                if(i<(n/2)){
                    for(int j=0;j<i;j++){
                        System.out.print("  ");
                    }
                    System.out.println("D");
                }
                else {
                    for(int j=i;j<n-1;j++){
                        System.out.print("  ");
                    }
                    System.out.println("D");
                }
            }
        }
    }
}
public class D_perten {
    public static void main(String[] args) {
        Perten p = new Perten();//object creation of class pertan
        p.perten();             //call perten function
    }
}