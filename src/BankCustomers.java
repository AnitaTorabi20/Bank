import java.util.ArrayList;

class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println("نام کاربر: " + account.getAccountHolderName() +
                    ", شماره حساب: " + account.getAccountNumber() +
                    ", موجودی: " + account.getBalance());
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("حساب پیدا شد: " + account.getAccountHolderName() +
                        ", شماره حساب: " + account.getAccountNumber() +
                        ", موجودی: " + account.getBalance());
                return account;
            }
        }
        System.out.println("حساب با شماره " + accountNumber + " یافت نشد.");
        return null;
    }
}