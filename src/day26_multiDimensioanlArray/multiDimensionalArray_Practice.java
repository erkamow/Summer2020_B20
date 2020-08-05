package day26_multiDimensioanlArray;

import java.util.Arrays;

public class multiDimensionalArray_Practice {
    /*
    testers: {"Liliia","odina","Cristina","Elkem"}
    developers: {"Ahmet","Erfan","Roza","Sarah"}
    SM: {"Nurmamet"};
    PO: {"Nadir"};
    BA: {"Alex"};
     */

    public static void main(String[] args) {

        String[] testers = {"Liliia","odina","Cristina","Elkem"};
        String[] developers = {"Ahmet","Erfan","Roza","Sarah"};
        String[] SM = {"Nurmamet"};
        String[] PO = {"Nadir"};
        String[] BA =  {"Alex"};



        String[] testers2 = {"irene","Aslan","Nazar"};

        String[][] Scrumteam = {testers,developers,SM,PO,BA};
        System.out.println(Arrays.deepToString(Scrumteam));

        Scrumteam[4][0] = "Adam";
        Scrumteam[1][2] = "Emine";
        Scrumteam[0] = testers2;
        Scrumteam[3][0] = "zeki";

        System.out.println(Arrays.deepToString(Scrumteam));

        System.out.println("============================================================");
        for(String[] each : Scrumteam){
            for(String name : each){
                System.out.println((name));
            }
           // System.out.println(Arrays.toString(each));
        }
        System.out.println("===========================================================");

        int[][] scores = {{10,20,20,45},{60,55,75,105},{93,48,125,135}};
         //                     0             1               2
        // print out the numbers divisible by 3 and 5 ...

        for(int[] each1Darray : scores){
            for(int eachelement : each1Darray){

                if(eachelement%3==0 && eachelement%5==0){
                    System.out.print(eachelement+" ");
                }
            }
        }
        System.out.println("==========================================================");

        int[][] a1 = {{1,2},{3,4,5}};
        int[][] a2 = {{6,7},{8,9,10}};

        int[][][] arr3D = {{{1,2},{3,4,5},{6,7},{8,9,10}}};
        


    }
}
