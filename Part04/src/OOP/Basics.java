package OOP;
public class Basics {
    public static void main(String[] args) {
        Account artosAccount = new Account("Artos account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);
        Account matthewsAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);


        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        artosAccount.withdraw(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance());

        artosSwissAccount.deposit(200);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);
        System.out.println("*******************************************");
        System.out.println();

        System.out.println("Initial state");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);

        matthewsAccount.withdraw(100);
        System.out.printf("The balance of Matthew's account is now: %.2f\n", matthewsAccount.balance());

        myAccount.deposit(100);
        System.out.printf("The balance of my account is now: %.2f\n", myAccount.balance());
        System.out.println("End state");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
        System.out.println("*******************************************");
    }
    static class Account {
        private final String accountName;
        private double balance;
        public Account(String accountName, double balance) {
            this.accountName = accountName;
            this.balance = balance;
        }
        public void withdraw(double amount) {
            this.balance -= amount;
        }
        public void deposit(double amount) {
            this.balance += amount;
        }
        public double balance() {
            return this.balance;
        }
        @Override
        public String toString() {
            return accountName + ": " + balance;
        }
    }
}

