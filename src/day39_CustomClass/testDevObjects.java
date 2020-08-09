package day39_CustomClass;

public class testDevObjects {
    public static void main(String[] args) {
        testDev emp1 = new testDev();
        emp1.setInfo("M.Erkam Afsin",'M',145354,540603,"SDET",
                8000,"Ultimate Turkey");
        emp1.getInfo();
        System.out.println("=============================================================");
        testDev emp2 = new testDev();
        emp2.setInfo("A.ammar Afsin",'M',123456,654321,"Dev Lead",
                12000,"Amazon");
        emp2.getInfo();

    }


}
