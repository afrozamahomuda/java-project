public class SavingsAccount extends Account 
{
    private double interestRate;

    // Default Constructor

    SavingsAccount() {

    }

    // parameterize Constructor and super class constructor has been called using super keyword
    
    SavingsAccount(String accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    // Setter

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Getter

    public double getInterestRate() {
        return interestRate;
    }
    
    
    
    public void SavingsAccountInfo() {

        System.out.println("Interest Rate : " + interestRate);
    
        }

}