package day08_logicalOperators;

public class practice {

    public static void main(String[] args) {


        int age = 19;
        String citizenShip = "USA";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        System.out.println(eligibleToVote);

        int age1 = 20;
        String firstName = "Aaron ";
        String lastName = "Daniel";
        String citizenship = "USA";

        boolean EligibleToVote = age1 >= 18 && citizenship == "USA";
        String FullName = firstName + lastName;

        System.out.println(FullName + " is eligible to vote: " + EligibleToVote);

        boolean r8 = true == !false || false == true;
        System.out.println(r8);

        boolean r9 = !false == false || true == !false;
        System.out.println(r9);

        boolean r10 = !false == false && true == !false;
        System.out.println(r10);


    }
}
