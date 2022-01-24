public class BankAccount {
   //variables
   private String firstName;
	 private String lastName;
   private int accountID;
   private double balance;

   public BankAccount() {
       balance = 0;
   }

   //deposit
   public void deposit(double amount) {
       balance += amount;
   }

   //withdraw
   public void withdraw(double amount) {
       balance -= amount;
   }

   //getters nd setters for firsName, lastName and accountID
   public String getFirstName() {
       return firstName;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public int getAccountID() {
       return accountID;
   }

   public void setAccountID(int accountID) {
       this.accountID = accountID;
   }

   //checking balance
   public double getBalance() {
       return balance;
   }

   public String accountSummary() {
       String name = "Name: " + firstName + " " + lastName;
       String accountInfo = name + ", Account: " + accountID + ", Balance: $" + balance;
       return accountInfo;
   }
}
