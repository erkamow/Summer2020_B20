package day27_Recap;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("===============================================");

        for(int each  : arr){
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("==================================================");



        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("==================================================");

        int[] scores = {10,20,30,40,50,60,70,80,90,100,110};
        int countDvisibleby3 = 0;

        for(int each : scores){
            if(each%3!=0){
                continue;

            }
            countDvisibleby3+=1;
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println(countDvisibleby3);

        System.out.println("=========================================================");
        String[] names = {"AB","ABC","A","AB","ABCD"};

        for(String each : names){
            if(!each.contains("C")){
                continue;
            }
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("=========================================================");

        int[] scores1 = {85,75,65,110,90,45,56,78};
        int max = scores1[0];
        int min = scores1[0];

        for(int each : scores1){
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }
        System.out.println("max number: "+max);
        System.out.println("min number: "+min);
    }
}
