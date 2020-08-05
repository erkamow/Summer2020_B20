package day23_Arrays;

public class Array {

    public static void main(String[] args) {

        String[] students = {"cybertek","erkam","kubra"};

        String name1 =students[1];
        System.out.println(name1);

        System.out.println("===============================================");

        int[] scores = {85,70,95,90,100};
        String[] names = {"mike","adam","tonny","john","amy"};

        // System.out.println(names[0] + ": " + scores[0]);
        for(int i = 0; i <= 4; i++){
            System.out.println(names[i] + ": " + scores[i]);
        }

        System.out.println("==================================================");

        String[] classMates = new String[5];
        classMates[0] = "fatih";
        classMates[1] = "erkam";
        classMates[2] = "kubra";
        classMates[3] = "ammar";
        classMates[4] = "zafer";

        for(int i = 0; i <= classMates.length-1; i++){
            System.out.println(classMates[i]);
        }

        System.out.println("======================================================");


        int[] prices = {20 , 8, 10 , 12, 15};
        String[] groceries = {"water","bread","drinks","snacks","fruits"};
        for(int i = 0; i <= 4; i++){
            System.out.println(groceries[i] + ": "+"$" + prices[i] );
        }





    }
}
