package day40_CustomClassRecap;

public class bankAccountObjects {
    public static void main(String[] args) {

        BankAccount Account = new BankAccount();

        Account.setBankInfo("M.Erkam Afsin",54344801,"gold Type",
                120000);
        Account.getBankInfo();
        Account.checkBalance();
        Account.deposit(5000);
        Account.checkBalance();
        Account.withdraw(1200);
        Account.checkBalance();
    }
}
