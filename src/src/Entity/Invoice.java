package Entity;

public class  Invoice extends  Customer{
    private int idInv;
    private Customer customer;
    private double amount;
    private double discount;

    public Invoice(int idInv, Customer customer, double amount, double discount) {
        this.idInv = idInv;
        this.customer = customer;
        this.amount = amount;
        this.discount = discount;
    }

    public Invoice (){;}


    public int getIdInv() {
        return idInv;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId(){
        return customer.getId();
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double getCustomerDiscount(double discount){
        return discount;
    }
    public double getAmountAfterDiscount(double discount){
        return amount / discount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "idInv=" + idInv +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }
}
