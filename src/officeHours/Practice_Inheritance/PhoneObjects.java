package officeHours.Practice_Inheritance;

public class PhoneObjects{

    public static void main(String[] args) {

        Samsung ph1 = new Samsung("Note2",500);
        ph1.call(155);
        ph1.text(112);
        System.out.println(ph1);
        System.out.println("============================");
        Apple Iph1 = new Apple("11 Pro MAX",1200);
        Iph1.call(911);
        Iph1.text(545);
        System.out.println(Iph1);
        System.out.println("=============================");
        Nokia nk1 = new Nokia("3310 smart",50);
        nk1.call(156);
        nk1.text(110);
        System.out.println(nk1);

        System.out.println("=====================================================");

        if(ph1.price > 1100){
            System.out.println("Legal price Testing  FAILED");
        }else {
            System.out.println("Legal price Testing PASSED");
        }

        if(Iph1.price >1100){
            System.out.println("Legal price Testing FAILED");
        }else {
            System.out.println("Legal price Testing FAILED");
        }
        if(nk1.price >1100){
            System.out.println("Legal price Testing FAILED");
        }else {
            System.out.println("Legal price Testing PASSED");
        }


    }
}
