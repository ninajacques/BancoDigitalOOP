public class SavingsAccount  extends Account {

    public SavingsAccount(Client client, double initialBalance) {
        super(client, initialBalance);
    }

    @Override
    public void printStatement() {
        System.out.println("==== Savings account ====");
        super.printStatement();
    }
}