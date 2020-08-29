package day47_Encapsulation;

public class TestBankInfo {
    public static void main(String[] args) {


        CapitalOneEmployee emp1 = new CapitalOneEmployee("Erkam",26,"SDET");
        //emp1.setSalary(135000);
        //emp1.setAdress();
        //emp1.setID();
        System.out.println(emp1+"\nUser ID: "+emp1.getID()+"\nSalary: "+emp1.getSalary()+"\nAddress: "+emp1.getAdress());
    }
}
