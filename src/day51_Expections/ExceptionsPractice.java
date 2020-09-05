package day51_Expections;

public class ExceptionsPractice {

    public static void main(String[] args) {

        System.out.println("Hello");

     /*
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){

        }


      */
        sleep(3);
        System.out.println("world");
/*
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }


 */
        sleep(5);
        System.out.println("how are you");

    }

    public static void sleep(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){

        }

    }
}
