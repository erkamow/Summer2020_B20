package day48_Inheritance.DeviceTask;

public class DeviceObjects {

    public static void main(String[] args) {

        laptop lap1 = new laptop("ACER","nitro5",1450,true,
                true,"17''",true,true,true,"microsoft");
        lap1.Using();
        System.out.println(lap1);

        System.out.println("============================================================================");

        TV tv1 = new TV("Samsung","XFIVE4k",2000,false,false,"55''",true);
        tv1.watch();
        System.out.println(tv1);

        System.out.println("===============================================================================");

        phone ph1 = new phone("Apple","11 proMax",1200,true,true,"6''",true);
        ph1.Use();
        ph1.call(5325446533l);
        System.out.println(ph1);
    }
}
