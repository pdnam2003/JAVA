package Entity;

import java.time.LocalDate;

public class Student extends Person {
    private String id;
    private LocalDate Dob;
    private Gender gender;

    public Student() {;}
    public Student(String id, String name,
                   LocalDate dob, Gender gender, String address) {
        super(name, address);
        this.id = id;
        this.Dob = dob;
        this.gender = gender;
            }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
     public String getName() {
        return super.getName();
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public LocalDate getDob() {
        return Dob;
    }

    public void setDob(LocalDate dob) {
        Dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public int getAge(){
        return Math.abs( LocalDate.now().getYear() - this.getDob().getYear());
    }

    @Override
    public String toString() {
        return "Student{" +
                ", id='" + id + '\'' +
                "name='" + this.getName() + '\'' +
                ", gender=" + gender +
                ", Dob=" + Dob +
                ",age =" + this.getAge() +
                ", address='" + this.getAddress() + '\'' +
                '}';
    }
}