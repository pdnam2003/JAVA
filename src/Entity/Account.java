package Entity;

public class Account extends Customer{
    private int id;
    private Customer customer;
    private double balance;


    public Account(int id,  Customer customer, double balance) {

        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account() {;}
    public Account(int id, Customer customer) {
        super(id, customer.getName(), customer.getGender());
        this.id = id;
        this.customer = customer;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double deposit(double amount){
        return balance += amount;
    }
    private double withdraw(double amount){
     if (balance>amount){
         balance -=  amount;
         return balance ;
     }else {
         System.out.println("error");
         return balance;
     }
    }
}
