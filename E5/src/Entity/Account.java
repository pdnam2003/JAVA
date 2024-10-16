package Entity;

public class Account extends  Customer{
    private int Id;
    private Customer Customer;
    private double Balance;

    public Account() {;}
    public Account(int Id, Customer Customer, double Balance) {
        this.Id = Id;
        this.Customer = Customer;
        this.Balance = Balance;
    }
    public Account(int Id, Customer Customer) {
        this.Id = Id;
        this.Customer = Customer;
    }

    @Override
    public int getId() {
        return Id;
    }

    public Entity.Customer getCustomer() {
        return Customer;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }
    public String getCustomerName() {
        return Customer.getName();
    }
    public void setDeposit(double amount) {
        Balance += amount + Balance;
    }
    public void setWithdraw(double amount) {
        if (Balance >= amount) {
        Balance +=  Balance - amount;}
        else {
            System.out.println("amount withdraw exceeds the current balance!");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "Id=" + Id +
                ", Customer=" + Customer +
                ", Balance=" + Balance +
                '}';
    }
}
