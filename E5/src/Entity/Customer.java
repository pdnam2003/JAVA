package Entity;

public class Customer {
    private int Id;
    private String Name;
    private Gender gender;
    private double discount;

    public Customer() {;}
    public Customer(int Id, String Name, Gender gender, double discount) {
        this.Id = Id;
        this.Name = Name;
        this.gender = gender;
        this.discount = discount;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", gender=" + gender +
                ", discount=" + discount +
                '}';
    }
}
