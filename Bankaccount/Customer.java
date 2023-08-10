public class Customer
{

    private int nid;
    private String name;
    private int index;
    private Account accounts[];

    // Default Constructor
    Customer() 
	{
        this.index = 0;
    }

    // parameterize Constructor
    Customer(int nid, String name, int size) 
	{
        this.nid = nid;
        this.name = name;
        this.index = 0;
        accounts = new Account[size];

    }

    // Setter
    public void setNid(int nid) {
        this.nid = nid;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getNid() {
        return nid;
    }

    public String getName() {
        return name;
    }

    // This method incert or add account with loop
    public Account addAccount(Account a) {
        int flag = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = a;
                flag = 1;
                break;
            }

        }
        if (flag == 1) {
            System.out.println("______[ Account Created ]______");

        } else {
            System.out.println("______[ Account Cannot Be Created ]______");

        }
        this.index++;
        return null;

    }

    

    void removeAccount(Account a) 
	{
        int flag = 0;
        for (int i = 0; i < accounts.length; i++) 
		{
            if (accounts[i] == a) 
			{
                accounts[i] = null;
                flag = 1;
                break;
            }
        }
        this.index--;
        if (flag == 1) 
		{
            System.out.println("______[ Account Removed ]______");
        } else {
            System.out.println("____[ Account Cannot Be Removed ]____");
        }
    }

    // This method used to show info
    public void showAllAccounts() 
	{

        for(int i = 0; i < this.index; i++) {
            System.out.println("Account No      : " + accounts[i].getAccountNo());
            System.out.println("Account Balance : " + accounts[i].getBalance());
            
            if(accounts[i].getInterestRate() != 0.0)
                System.out.println("Interst Rate: " + accounts[i].getInterestRate());
            else
                System.out.println("Tenure Year : " + accounts[i].getTenureYear());

            System.out.println("");
        }
    }

}