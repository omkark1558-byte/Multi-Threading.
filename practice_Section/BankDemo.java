package multi_threading.practice_Section;

public class BankDemo {


		public static void main(String[] args) throws InterruptedException {

	        Bank_Accounts account = new Bank_Accounts();

	        DepositThread t1 = new DepositThread(account);
	        WithdrawThread t2 = new WithdrawThread(account);

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        System.out.println("Final Balance: " + account.getBalance());
	    }
	}

class Bank_Accounts{
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " Deposited: " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        balance -= amount;
        System.out.println(Thread.currentThread().getName() +
                " Withdraw: " + amount + " | Balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}
class DepositThread extends Thread {

    private Bank_Accounts account;

    public DepositThread(Bank_Accounts account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(500);
        }
    }
}
class WithdrawThread extends Thread {

    private Bank_Accounts account;

    public WithdrawThread(Bank_Accounts account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            account.withdraw(300);
        }
    }
}