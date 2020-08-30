package day48_Inheritance;

public class BankAccount {
    public String firstName;
    public String lastName;

    public static String bankName;
    static {
        bankName = "Bank of America";
    }
    public BankAccount (String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String accountHolder = "M.Erkam AFSIN";
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;

    }

    private int accountNumber = 19940603;
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    private double balance = 85000;
    public double getBalance(){
        return balance;
    }
    public void setBalance (double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        System.out.println("Depositing: $"+amount);
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Not enough balance!!!");
            return;
        }
        System.out.println("withdrawing: $"+amount);
        balance-=amount;
    }

    public void availableBalance(){
        System.out.println("Available balance: $"+balance);
    }

    public String toString (){
        return "First Name: "+firstName+"\nLast Name: "+lastName+"\nBank Name: "+bankName;
    }
}
