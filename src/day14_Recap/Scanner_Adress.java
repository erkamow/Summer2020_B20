package day14_Recap;

import java.util.Scanner;

public class Scanner_Adress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your building number: ");
        int buildingNumber = scan.nextInt();
        scan.nextLine();

        System.out.println(" Enter your street adress: ");
        String streetAdress = scan.nextLine();

        System.out.println(" Enter your city name: ");
        String cityName = scan.next();

        System.out.println(" Enter your state name: ");
        String stateName = scan.next();

        System.out.println(" Enter your zip code: ");
        int zipCode = scan.nextInt();
        scan.nextLine();

        System.out.println(" Enter your full name: ");
        String fullName = scan.nextLine();
        
        scan.close();

        System.out.println(" Ship to: " + fullName + '\n' + buildingNumber + " " + streetAdress + '\n' + cityName + "," + " " + stateName + " " + zipCode);






    }
}
