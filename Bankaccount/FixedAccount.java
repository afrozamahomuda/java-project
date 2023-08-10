public class FixedAccount extends Account 
{
    private int tenureYear;

    // Default Constructor
    FixedAccount() {

    }

    // parameterize Constructor and super class constructor has been called using
    // super keyword
    FixedAccount(String accountNo, double balance, int tenureYear) {
        super(accountNo, balance);
        this.tenureYear = tenureYear;
    }

    // Setter

    public void setTenureYear(int tenureYear) {
        this.tenureYear = tenureYear;
    }

    // Getter

    public int getTenureYear() {
        return tenureYear;
    }
    
    
    
    public void FixedAccountInfo() {
        super.AccountInfo(); 
        System.out.println("Tenure Year : " + tenureYear);
    }

}