import java.util.UUID;

public class Account implements IAccount {
    private final UUID accountNumber;
    private final Client client;
    private double balance;

    public Account(Client client, double initialBalance) {
        this.accountNumber = UUID.randomUUID();
        this.client = client;
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double value) {
        if(value > balance) {
            System.out.print("Você não possui saldo suficiente!");
            return;
        }

        this.balance -= value;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void transfer(Account account, double value) {
        if(value > balance) {
            System.out.print("Você não possui saldo suficiente!");
            return;
        }

        this.balance -= value;
        account.deposit(value);
    }

    @Override
    public void printStatement() {
        System.out.printf("Account number: %s \n", this.accountNumber);
        System.out.printf("Client number: %s \n", this.client.getName());
        System.out.printf("Amount: %s \n", this.balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", client=" + client +
                ", balance=" + balance +
                '}';
    }
}
