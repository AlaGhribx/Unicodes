
import java.util.Scanner;

public class welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name ");
        String name = input.nextLine();
        System.out.print("enter your birth year ");
        int s = input.nextInt();
        int age = 2026 - s ;

        System.out.println("welcome "+ name);
        System.out.println("your age = "+ age);
    }
    
}
