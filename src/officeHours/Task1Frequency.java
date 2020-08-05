package officeHours;

public class Task1Frequency {

    public static void main(String[] args) {

        String str = "OOPQQ";
        String nonDup = ""; // O, P, Q, Q

        // remove duplicates:

        for(int i = 0; i <= str.length()-1; i++){
            String s = ""+str.charAt(i);
            if(!nonDup.contains(s)){
                nonDup+=s;
            }
        }
        String result = "";
        for(int j = 0; j <= nonDup.length()-1; j++){
            char ch1 = nonDup.charAt(j);
            int count1 = 0;
            for(int i = 0; i <= str.length()-1; i++){
                char each = str.charAt(i);
                if(each == ch1){
                    count1+=1;
                }
            }
            result += ""+ch1+count1;

        }
        System.out.println(result);
        /*
        String result = "";
         char ch1 = nonDup.charAt(0);
         int count1 = 0;
         for(int i = 0; i <= str.length()-1; i++){
             char each = str.charAt(i);
             if(each == ch1){
                 count1+=1;
             }
         }
         result+= ""+ch1+count1;

         char ch2 = nonDup.charAt(1);
         int count2 = 0;
         for(int i = 0; i <= str.length()-1; i++){
             char each = str.charAt(i);
             if(each == ch2){
                 count2+=1;
             }
         }
         result+= ""+ ch2+count2;

         char ch3 = nonDup.charAt(2);
         int count3 = 0;
         for(int i = 0; i <= str.length()-1; i++){
             char each = str.charAt(i);
             if(each == ch3){
                 count3+=1;
             }
         }
         result+= ""+ch3+count3;

         */

    }
}
