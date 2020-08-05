package day08_logicalOperators;
//1. Create a double variable with the value 20
//2. Create a second variable of type double with the value 80
//3. Add both numbers up and multiply by 25
//4. Use the remainder operator to figure out the remainder from the sum of #3 divided
//by 40
//5. Print remaining total (#4) is equal to 20 or less : true/false
public class practice4 {

    public static void main(String[] args) {

        double num1 = 20;
        double num2 = 80;
        double result = (num1 + num2) * 25; // 2500
        double reminder = result % 40;

        boolean r =reminder <= 20;
        System.out.println(r);




    }
}
