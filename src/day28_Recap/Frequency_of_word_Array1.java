package day28_Recap;

public class Frequency_of_word_Array1 {

    public static void main(String[] args) {

        String[] arr = {"Java", "C#", "Python", "Java"};

        String word = "Java";

        int count = 0;

        for(String each : arr){
            if(!each.equalsIgnoreCase(word)){
                continue;

            }else{
                count+=1;
            }
        }
        System.out.println(count);

    }
}
