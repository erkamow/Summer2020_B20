package day08_logicalOperators;

public class practice2 {

    public static void main(String[] args) {

        int age = 21;

        String FirstName = "Erkam";
        String LastName = " AFSIN";

        String citizenship1 = "Turkey";
        String citizenship2 = "USA";

        boolean usCitizenship = citizenship1 == "Turkey" || citizenship2 == "USA";
        System.out.println(usCitizenship);

        boolean eligibilityForVote = age >= 18  && citizenship2 == "USA";
        String FullName = FirstName + LastName;
        System.out.println(FullName + " is eligible for vote: " + eligibilityForVote);












    }
}
