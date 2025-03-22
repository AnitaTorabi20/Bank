class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("برای حساب جاری سودی محاسبه نمی‌شود.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overDraftLimit) {
            balance -= amount;
            System.out.println(amount + " تومان از حساب شماره " + getAccountNumber() + " برداشت شد.");
        } else {
            System.out.println("مبلغ وارد شده نادرست است یا بیش از حد مجاز برداشت است.");
        }
    }
}