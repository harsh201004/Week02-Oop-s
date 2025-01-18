public class BankDetails {
    String accountNumber;
    String accountHolderName;
    double balance;
    double interestRate;
    
    public BankDetails(String accountNumber, String accountHolderName, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    public void displayDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + interestRate);
    }
    
    public static void main(String[] args) {
        BankDetails bank = new BankDetails("1234567890", "John Doe", 10000, 5.5);
        bank.displayDetails();
    }
}
