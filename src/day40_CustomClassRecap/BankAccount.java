package day40_CustomClassRecap;

public class BankAccount {
    /*
    task:
    BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance

        Actions:
            1. CheckBalance,   2. deposit,  3. withdraw

          requiremnts:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance

     */
    String accountName;
    int accountNum;
    String accountType;
    double balance;

    public void setBankInfo(String bankAccountName , int bankAccountNum , String bankAccountType, double Balance) {
    accountName = bankAccountName;
    accountNum = bankAccountNum;
    accountType = bankAccountType;
    balance = Balance;


    }
    public void getBankInfo(){
        System.out.println("Account name: " +accountName);
        System.out.println("Account number: "+accountNum);
        System.out.println("Account type: "+accountType);
        System.out.println("Available balance: "+balance+"$");

        System.out.println("=============================");

    }
    public void checkBalance(){
        System.out.println("Available balance: "+balance+"$");
    }

    public void deposit(double amount){
        System.out.println("Depositing: "+amount+" to "+ accountNum);
        balance+=amount;
    }
    public void withdraw(double amount){
        System.out.println("withDrawing: "+amount+" from "+ accountNum);
        balance-=amount;
    }
}
