package fundamentals.oop;

//BankAccount which is consists of:
//constructor: with arguments: type and currency ( for initializing the fields and the  balance will be initialized with
//            0 in the constructor)
//fields: type of the account (SAVING or SPENDING),  balance ( the amount of money), currency ( USD, EUR),
//methods:
//        -addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of money that is
//          added needs to be bigger than 10% of balance otherwise print a suggestive  error message)
//        -balance otherwise print a suggestive  error message)
//          withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance
//         can not be < 0 otherwise print a suggestive
//        error message ),
//        -covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert, and the currency to convert to
//          and returns the result = the money in the input currency)

public class BankAccount {
    /**
     * Type of account: SAVING or SPENDING
     */
    private String type;
    /**
     * Type of currency: USD or EUR
     */
    private String currency;
    /**
     * Balance of the account
     */
    private double balance;

    public final static double USD_TO_EUR = 0.82;
    public final static double EUR_TO_USD = 1.21;

    public BankAccount() {
        this.balance = 0;
        this.currency = "USD";
        this.type = "SAVING";
    }

    public BankAccount(String type, String currency) {
        this.balance = 0;
        this.currency = currency;
        this.type = type;
    }


    public String toString() {
        return "Account type: " + this.type + "\nCurrency: " + this.currency + "\nBalance: " + this.balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Return the balance of the account
     *
     * @return
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void addMoney(double amount) {
        if (this.type.equals("SPENDING") && amount > (this.balance / 10)) {
            System.out.println("ERROR: Amount is lower than 10% of Balance");
            return;
        }
        this.balance += amount;
        System.out.println("\nCurrent balance after adding: " + this.balance);
    }

    public void withdrawMoney(double amount) {
        if (this.type.equals("SAVING") && 0 > (this.balance - amount)) {
            System.out.println("ERROR: Amount remaining is lower than 0, amount can't be withdrawn");
            return;
        }
        this.balance -= amount;
        System.out.println("\nCurrent balance after withdrawing: " + this.balance + "\n");

    }

    public void convertMoneyToCurrency(double amount, String inputCurrency) {
        if (inputCurrency.equals("EUR")) {
            System.out.println("Amount in USD: " + amount * EUR_TO_USD);
        } else {
            System.out.println("Amount in EUR: " + amount * USD_TO_EUR);
        }
    }


}
