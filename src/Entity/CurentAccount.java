package Entity;

public class CurentAccount extends BankAccount {
    public CurentAccount() {
        ;
    }

    public CurentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited of $ " + amount + " successfull. Current balance :$ " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("withdrawal of $" + amount + " successfull. Current balance :$ " + getBalance());
        } else {
            System.out.println("insufficient funds.failed " );
        }
    }
}
