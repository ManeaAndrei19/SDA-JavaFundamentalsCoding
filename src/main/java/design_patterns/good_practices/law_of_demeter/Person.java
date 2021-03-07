package design_patterns.good_practices.law_of_demeter;

public class Person {
    private Wallet wallet = new Wallet(100);
    public Wallet getWallet() {
        return wallet;
    }
    public int pleaseGiveMeSomeMoney(int amount) {
        return wallet.take(amount);
    }
}
