package day15_String;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        String Fullname = "Erkam Afsin";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println(" Enter your last name");
        String lastName = scan.next();
        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);

        System.out.println(" Your initials are: "+ch1+ch2);


        int l = Fullname.length() -1;
        System.out.println("last index number is: "+l);

    }
}
