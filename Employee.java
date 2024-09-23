

public class Employee {
    private  int Id;
    private  String firstName;
    private String lastName;
    private int salary;
    public Employee(int Id, String firstName, String lastName, int salary) {
        this.Id = Id;
        this.firstName=firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getID() {
        return Id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return  firstName +  lastName;
    }
    public  int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary *12;
    }
    public  int raiseSalary(int percent){
        salary = salary + (salary * percent / 100);
        return salary;
    }
    @Override
    public String toString() {
        return "Employee [id = " + Id + "; name = " + firstName + lastName + "; salary = " + salary + "]";
    }
}