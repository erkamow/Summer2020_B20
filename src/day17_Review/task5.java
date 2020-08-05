package day17_Review;

import java.util.*;

public class task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email adress");
        String email = scan.nextLine();
        boolean dom = email.contains("gmail");
        boolean dom2 = email.contains("yahoo");
        if(dom){
            System.out.println("the domain of the email is: gmail" );
        }else if(dom2){
            System.out.println(" the domin of the email is: yahoo ");
        }else{
            System.out.println(" invalid domain adress");
        }

    }
}
