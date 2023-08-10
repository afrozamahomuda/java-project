public class Account 
{

    // Instance variable
    private String accountNo;
    private double balance;

    // Default Constructor
    Account() {
        // System.out.println("Default Constructor of Account Class");
    }

    // parameterize Constructor
    Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Setter
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter
    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    // This method used to show info
    public void AccountInfo() {
        System.out.println("Account Number : " + accountNo);
        System.out.println("Balance : " + balance);
    }

    public int getTenureYear() {
        return 0;
    }

    public double getInterestRate() {
        return 0.0;
    }
}