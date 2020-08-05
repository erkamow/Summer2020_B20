package day11_NestedIf_Switch;

public class warmup {

    public static void main(String[] args) {

        double n1 = 100;
        double n2 = 200;
        double n3 = 300;


        boolean n1Bigger = (n1 > n2 && n1 > n3);
        boolean n2Bigger = (n2 > n1 && n2 > n3);
        boolean n3Bigger = (!n1Bigger && !n2Bigger);
        String result = "";

        if(n1Bigger){
            result = " n1 is biggest";

        }else if(n2Bigger){
            result = " n2 is biggest";

        }else{
            result = " n3 biggest";

        }
        System.out.println(result);

        String result2 =(n1Bigger)? " n1 is biggest" :(n1Bigger)? " n2 is biggest" : " n3 is biggest";
        System.out.println(result2);
    }
}
