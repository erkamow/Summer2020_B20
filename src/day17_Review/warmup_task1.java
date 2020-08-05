package day17_Review;
import java.util.Scanner;

public class warmup_task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

       firstName = firstName.toUpperCase();
       lastName = lastName.toUpperCase();

        char name = firstName.charAt(0);
        char surname = lastName.charAt(0);





        System.out.println("your initials is: " + name + surname);
    }

}
