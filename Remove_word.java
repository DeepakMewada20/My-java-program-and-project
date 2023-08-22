import java.util.Scanner;
import java.lang.String;
public class  Remove_word{
    public static void main(String[] args) {
        String str,word,new_str="";
        Scanner sc=new Scanner(System.in);//create object of Scanner class
       System.out.print("Enter string = ");
       str=sc.nextLine();//input string
       System.out.print("enter word, you remove from String = ");
       word=sc.nextLine();
       String str2[]=str.split(" ");//defined new string and split string(str). and store str2 string
        //for each loop
       for (String i:str2){
           if(!i.equals(word)){
               new_str+=i+" ";
           }
       }
       System.out.print(new_str);//print New string
    }
}
