abstract class BankAccount {
    private final String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " تومان به حساب شماره " + accountNumber + " اضافه شد.");
        } else {
            System.out.println("مبلغ وارد شده نادرست است.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " تومان از حساب شماره " + accountNumber + " برداشت شد.");
        } else {
            System.out.println("مبلغ وارد شده نادرست است یا موجودی کافی نیست.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
