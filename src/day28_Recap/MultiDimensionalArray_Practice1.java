package day28_Recap;

public class MultiDimensionalArray_Practice1 {


    public static void main(String[] args) {

        String[] grp1 = {"Erkam","Ammar","Kubra","Zafer"};
        String[] grp2 = {"Arif","Suat","FetG","Mikail"};
        String[] grp3 = {"Urve","Akif","Emre",};

        String[][] CybertekGrp = {{"Erkam","Ammar","Kubra","Zafer"},
                {"Arif","Suat","FetG","Mikail"},{"Urve","akif","Emre",}};

        for(int i = 0; i <= CybertekGrp.length-1; i++){
         String[] eachArray  = CybertekGrp[i];
         for(int j = 0; j <= eachArray.length-1; j++){
             String eachElements = eachArray[j];
             if(eachElements.startsWith("A") || eachElements.startsWith("a")){
                 System.out.print(eachElements+" ");
             }

         }

        }


    }
}
