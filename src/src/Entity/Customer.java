package Entity;

public class Customer {
    private int id;
    private String name;
    private Gender gender;

    public  Customer(){;}
    public Customer(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

                " name='" + name + '\'' + "(id=" + id +
                ")"     +     '}';
    }
}
