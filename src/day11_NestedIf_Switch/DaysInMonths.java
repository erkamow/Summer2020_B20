package day11_NestedIf_Switch;

public class DaysInMonths {

    public static void main(String[] args) {

        int month = 3;

        boolean validNumber = month >= 1 && month <= 12;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;

        String result = "";
        if (validNumber) {

            if (days28) {
                result = "28days";

            } else if (days30) {
                result = "30days";
            } else {
                result = "31days";
            }


        } else {
            result = "invalid";
        }
        System.out.println(result);
    }
}
