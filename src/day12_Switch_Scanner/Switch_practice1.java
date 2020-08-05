package day12_Switch_Scanner;

public class Switch_practice1 {

    public static void main(String[] args) {

        int num = 5;

        switch (num) {

            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid");
                break;
        }
        System.out.println("====================================================");

        int month = 1;

        String result2 = "";

        switch (month) {

            case 1:
                result2 = "january";
                break;
            case 2:
                result2 = "february";
                break;
            case 3:
                result2 = "march";
                break;
            case 4:
                result2 = "april";
                break;
            case 5:
                result2 = "may";
                break;
            case 6:
                result2 = "june";
                break;
            case 7:
                result2 = "july";
                break;
            case 8:
                result2 = "august";
                break;
            case 9:
                result2 = "september";
                break;
            case 10:
                result2 = "october";
                break;
            case 11:
                result2 = "november";
                break;
            case 12:
                result2 = "december";
                break;
            default:
                result2 = "invalid";
                break;

        }
        System.out.println(result2);

        }

    }







