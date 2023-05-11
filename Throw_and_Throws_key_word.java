class NegetiveRediusException extends Exception{
    @Override
    public String toString(){
        return "NegetiveRediusException";
    }
    @Override
    public String getMessage(){
        return "redius can not be negetive";
    }
}
public class Throw_and_Throws_key_word {
    public static double area_of_circal(int r)throws NegetiveRediusException{
        if(r<0){
            throw new NegetiveRediusException();
        }
        double area=Math.PI*r*r;
        return area;
    }
    public static int divid(int a,int b) throws ArithmeticException{
        int ans=a/b;
        return ans;
    }
    public static void main(String[] args) {
        try {
            double ar=area_of_circal(-3);
            System.out.println(ar);
            try {
                int ans=divid(5,0);
                System.out.println(ans);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
