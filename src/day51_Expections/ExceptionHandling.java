package day51_Expections;

import java.util.ArrayList;

public class ExceptionHandling {
    public static void main(String[] args) {

        String exceptionMessage = "";


    ArrayList<Integer> list = new ArrayList<>();

    try{
        System.out.println(list.get(1));

    }catch (IndexOutOfBoundsException e){
       exceptionMessage = e.getMessage();
    }



        System.out.println("Next Step");
        System.out.println(exceptionMessage);

}
}
