package Entity;

import java.time.LocalDate;

public class Invoice extends Customer{
    private int Id;
    private Customer Customer;
    private double amount;
    private LocalDate dateTime;

    public  Invoice(){;}
    public Invoice(int id,  Customer customer, double amount, LocalDate dateTime) {
        this.Id = id;
        this.Customer = customer;
        this.amount = amount;
        this.dateTime = dateTime;
    }

    @Override
    public int getId() {
        return Id;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setCustomer(Customer customer) {
        Customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }
    public void getCustomerName() {
        this.Customer.getName();
    }
    public void getCustomerDiscount() {
        this.Customer.getDiscount();
    }
    public void getAmountAfterDiscount() {
        this.amount = getDiscount() * amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "Id=" + Id +
                ", Customer=" + Customer +
                ", amount=" + amount +
                ", dateTime=" + dateTime +
                '}';
    }
}
