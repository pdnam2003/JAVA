package Entity;

public class Manager extends Staff{

    private double Allowance;

    public Manager(String name, double salary, double Allowance) {
        super(name,salary);
        this.Allowance = Allowance;
    }
    public Manager(){;}
    public double getAllowance() {
        return Allowance;
    }

    public void setAllowance(double allowance) {
        this.Allowance = allowance;
    }

    @Override
    public double getPaid() {
        return getSalary() + Allowance;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + this.getName() + '\''
                +", salary=" + this.getSalary() + '\''
                +", Allowance=" + Allowance  + '\''
                +", paid :" + this.getPaid()  + '\'' +
                '}';
    }
}
