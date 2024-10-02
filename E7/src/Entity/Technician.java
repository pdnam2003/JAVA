package Entity;

public class Technician extends Staff {
    private double overtimePay;
    public Technician(){;}
    public Technician(String name,double salary, double overtimePay){
        super(name,salary);
        this.overtimePay = overtimePay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    @Override
    public double getPaid() {
        return getSalary() + overtimePay;
    }

    @Override
    public String toString() {
        return "Technician{" +
                "name='" + this.getName() + '\''
                +", salary=" + this.getSalary() + '\''
                +", overtimePay=" + overtimePay
                +", paid :" + this.getPaid()  + '\'' +
                '}';
    }
}
