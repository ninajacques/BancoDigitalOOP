public class CheckingAccount  extends Account {

    public CheckingAccount(Client client, double initialBalance) {
        super(client, initialBalance);
    }

    @Override
    public void printStatement() {
        System.out.println("==== Checking account ====");
        super.printStatement();
    }
}
