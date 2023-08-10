public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1234, "afroza", 2);
        SavingsAccount sa = new SavingsAccount("9876", 200.23, 0.15);
        FixedAccount fa = new FixedAccount("4321", 500.34, 2);

        customer.addAccount(sa);
        customer.addAccount(fa);
        
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("                    Account Details                    ");
        System.out.println("-------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Nid           : " + customer.getNid());
        System.out.println("Name          : " + customer.getName());
        System.out.println();
        customer.showAllAccounts();
	}
}	