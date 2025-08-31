import java.util.*;

public class Bank {
    private final List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAcconunt(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
