package day20_whileLoops;

public class Task3 {

    public static void main(String[] args) {

        String str = "aabb"; // "ab"
        //            0123

        String result = "";

        for(int i = 0; i <= str.length()-1; i++){

            String s = "" + str.charAt(i);

            if(!result.contains(s) ){
                result += s;
            }
            System.out.println(result);
        }
    }
}
