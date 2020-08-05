package day12_Switch_Scanner;

public class Switch {

    public static void main(String[] args) {
        int a = 10;

        switch (a){

            case 5:
                System.out.println("five");
                break;

            case 10:
                System.out.println("ten");
                break;

            default:
                System.out.println("invalid case");
                break;
        }
    }
}
