

public class Test{//driver class for testing purpose
   public static void main(String[] args) {
       checkingAccount obj = new checkingAccount();

       obj.setAccountID(1234567);
       obj.setFirstName("Strite");
       obj.setLastName("Phukana");

       obj.deposit(5000);

       System.out.println(obj.accountSummary());

       obj.processWithdraw(2000);

       obj.displayAccount();
   }
}
