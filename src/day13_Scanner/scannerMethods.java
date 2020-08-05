package day13_Scanner;
import java.util.Scanner;

public class scannerMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("your Car has 4 doors");
        boolean result = scan.nextBoolean();

        System.out.println(result);
    }
}
