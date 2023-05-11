import java.util.Scanner;
import java.io.IOException;
class Library{
    int[] book_number=new int[10];
    String[] book_name=new String[10];
    Scanner sc=new Scanner(System.in);
    void return_book(){

    }
    void provide_book(){

    }
    void add_book(){
        for (int i=0;i<10;i++){
            if (book_number[i]==0) {
                System.out.print("Enter book number = ");
                book_number[i]=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter book name");
                book_name[i]=sc.nextLine();
                break;
            }
        }
        System.out.println("Array is full, you can't add book");
    }
    void display_book() {
        System.out.println("This books are avelabal");
        for (int i=0;i<10;i++){
            System.out.println("Book number = "+book_number[i]+" and name = "+book_name[i]);
            sc.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            break;
        }
    }
}
public class Online_library {
    public static void main(String[] args) {
        Library l=new Library();
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("This is Online library");
            System.out.println("1. Provide book");
            System.out.println("2. Return book");
            System.out.println("3. Add book");
            System.out.println("4. Display book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice = ");
            choice = sc.nextInt();
            if (choice != 5) {
                switch (choice) {
                    case 1: {
                        l.provide_book();
                        break;
                    }
                    case 2: {
                        l.return_book();
                        break;
                    }
                    case 3: {
                        l.add_book();
                        break;
                    }
                    case 4: {
                        l.display_book();
                        break;
                    }
                    default: {
                        System.out.println("please enter velid choice");
                        break;
                    }
                }
            }
        }while (choice!=5);
    }
}
