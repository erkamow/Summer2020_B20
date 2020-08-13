package day40_CustomClassRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {


        BankAccount erkam = new BankAccount();
        BankAccount kubra = new BankAccount();
        BankAccount ammar = new BankAccount();
        BankAccount zafer = new BankAccount();

        erkam.setBankInfo("M.Erkam Afsin",34567892,
                "checking",120000);
        kubra.setBankInfo("Kubra Afsin",1234567,
                "checking",200000);
        ammar.setBankInfo("A.Ahmet Afsin",12332145,
                "checking",180000);
        zafer.setBankInfo("Zafer Demir",45665474,
                "investing",160000);

        ArrayList<BankAccount> accountList = new ArrayList<>();
        accountList.addAll(Arrays.asList(erkam,kubra,ammar,zafer));

        for(BankAccount accountEach : accountList){
            accountEach.deposit(1000);
            accountEach.getBankInfo();
        }

        accountList.get(0).deposit(30000);
        accountList.get(0).checkBalance();
        System.out.println("=============================================");
        accountList.get(0).withdraw(1000);
        accountList.get(0).checkBalance();

        System.out.println("##############################################");

        accountList.removeIf(p -> p.balance < 200000);
        for(BankAccount each : accountList){
            each.getBankInfo();
        }



    }
}
