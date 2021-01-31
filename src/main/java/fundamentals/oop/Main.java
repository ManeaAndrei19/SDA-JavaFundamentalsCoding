package fundamentals.oop;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount2 = new BankAccount("SAVING", "EUR");
        Client client = new Client("123412454", "Andrei", bankAccount);
        Client client2 = new Client("992931", "Ion,", bankAccount2);

        System.out.println("Type: " + bankAccount.getType());
        System.out.println("Currency: " + bankAccount.getCurrency());
        System.out.println("Balance: " + bankAccount.getBalance());

        System.out.println("\nClient name: " + client.getName());
        System.out.println("Client cnp: " + client.getCnp());
        System.out.println("Client balance: " + client.getBankAccount().getBalance());

        System.out.println("\n" + client.toString());

        client.getBankAccount().setBalance(155);

        System.out.println("\n" + client.toString());

        client.getBankAccount().addMoney(112);

        client2.getBankAccount().setBalance(155);
        client2.getBankAccount().addMoney(1112);
        client2.getBankAccount().withdrawMoney(150);

        client.getBankAccount().convertMoneyToCurrency(1500, "EUR");
        client.getBankAccount().convertMoneyToCurrency(1500, "USD");
/**
 * ##############################################################################################
 */
        BankAccount banks1 = new BankAccount("SAVING", "EUR");
        BankAccount banks2 = new BankAccount("SPENDING", "USD");

        Client client3 = new Client("77777", "John");
        BankAccount[] banksArray = {banks1, banks2};
        client3.setBankAccounts(banksArray);
        client3.getBankAccounts()[0].setBalance(1000012);
        System.out.println(client3.getBankAccounts()[0] + "\n");
        client3.getBankAccounts()[1].setBalance(1231230012);
        System.out.println(client3.getBankAccounts()[1]);

//        client.getBankAccounts()


    }
}
