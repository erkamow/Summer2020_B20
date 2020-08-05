package day34_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";
      int a =  Integer.parseInt(str);
        System.out.println(a + 1); // 124
        System.out.println(str + 1); // 1231

        Double d1 = Double.parseDouble("7.5"); // autoboxing
        System.out.println(d1 - 1);

        // Parse Method =========================================
        String s1 = "true"; // "TRUE" parse method ignores case sensivity
        boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(b1);
        System.out.println("=================================================================");

        // valueOf Method ========================================
        String s2 = "10000.5";
            double d2  =  Double.valueOf(s2);  // unboxing
        System.out.println(d2*2);

        String s3 = "False";
        boolean r2 = Boolean.valueOf(s3);  // unboxing
        System.out.println(r2);



    }
}
