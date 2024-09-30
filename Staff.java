package Entity;

public class Staff extends Person {
    private int id;
    private String School;
    private double pay;
    private Gender gender;

    public Staff() {;}
    public Staff(int id,String name ,String School, double pay, Gender gender, String address) {
        super(name,address);
        this.id = id;
        this.School = School;
        this.pay = pay;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.Name = name;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        this.School = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", School='" + School + '\'' +
                ", pay=" + pay +
                ", address='" + address + '\'' +
                '}';
    }
}
