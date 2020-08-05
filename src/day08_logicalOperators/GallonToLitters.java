package day08_logicalOperators;

public class GallonToLitters {

    public static void main(String[] args) {


        // 1 gallon = 3.785 liters
        // 1 litter = 1/3,785

        double gallons = 15;
        double liters = gallons * 3.785;

        System.out.println( gallons + " gallons equal to " + liters + " liters");
    }
}
