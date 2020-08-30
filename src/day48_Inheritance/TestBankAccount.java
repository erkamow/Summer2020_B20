package day48_Inheritance;

public class TestBankAccount {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Erkam","AFSIN");
        account1.setAccountHolder("kubra Afsin");
        account1.setBalance(125000);
        System.out.println(account1+"\nAccount holder: "+account1.getAccountHolder()+"\nAccount Number: "
                +account1.getAccountNumber()+"\nBalance: "+account1.getBalance());

        account1.deposit(10000);
        account1.availableBalance();
        account1.withdraw(15000);
        account1.availableBalance();

    }
}
