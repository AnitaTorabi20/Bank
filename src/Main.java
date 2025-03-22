public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        SavingAccount saving1 = new SavingAccount("12345", "Hafez Shirazi", 1000);
        SavingAccount saving2 = new SavingAccount("67890", "Saadi Shirazi", 2000);
        SavingAccount saving3 = new SavingAccount("98075","Nezami Ganjavi",1700);
        TransactionAccount transaction1 = new TransactionAccount("54321", "Abolghasem Ferdowsi", 1500);
        TransactionAccount transaction2 = new TransactionAccount("98765", "Mohammad Balkhi", 500);
        TransactionAccount transaction3 = new TransactionAccount("56129","Parvin Etesami",8000) ;

        bank.addAccount(saving1);
        bank.addAccount(saving2);
        bank.addAccount(saving3);
        bank.addAccount(transaction1);
        bank.addAccount(transaction2);
        bank.addAccount(transaction3);

        bank.showAllBalances();
        System.out.println();

        BankAccount foundAccount = bank.findAccount("12345");
        if (foundAccount != null) {
            foundAccount.deposit(500);
            System.out.println("موجودی جدید: " + foundAccount.getBalance());
        }

        bank.findAccount("99999");

        foundAccount.deposit(-100);

        saving1.calculateInterest();
        System.out.println("موجودی جدید: " + foundAccount.getBalance());
        transaction1.calculateInterest();
        System.out.println();

        saving1.withdraw(200);
        saving2.withdraw(-300);
        saving3.withdraw(1800);
        System.out.println();
        transaction1.withdraw(300);
        transaction2.withdraw(-100);
        transaction3.withdraw(9000);
        System.out.println();

        bank.showAllBalances();
    }
}
