public class Main {
    public static void main(String[] args) {
        Bank poneiBank = new Bank();

        Account edsonAccount = new CheckingAccount(new Client("Edson Guimarães"), 0);
        Account joanaAccount = new SavingsAccount(new Client("Joana Silva"), 200);

        poneiBank.addAcconunt(edsonAccount);
        poneiBank.addAcconunt(joanaAccount);

        joanaAccount.deposit(322);
        joanaAccount.transfer(edsonAccount, 22);


        edsonAccount.printStatement();
        joanaAccount.printStatement();

        System.out.println(poneiBank);
    }
}
