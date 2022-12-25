public class TestBank {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.deposit("checking", 500);
        account1.deposit("savings", 1000);
        account1.withdrawal("checking", 100);
        // account1.withdrawal("checking", 1000); insufficient funds
        account1.balance();
    }
}