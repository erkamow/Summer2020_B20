package day13_Scanner;

public class browsers {

    public static void main(String[] args) {

        String browserName = "chrome";

        switch (browserName){

            case "chrome":
                System.out.println("opening chrome browser");
                break;
            case "firefox":
                System.out.println("openin firefox browser");
                break;
            case "opera":
                System.out.println("openin opera browser");
                break;
            case "safari":
                System.out.println("opening safari browser");
                break;
            case"edge":
                System.out.println("opening edge browser");
                break;
            default:
                System.out.println("invalid browser name");
        }
    }
}
