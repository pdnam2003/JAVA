public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(1, "John", "Doe", 5000);
        employees[1] = new Employee(2, "jhin", "hanna", 10000);
        employees[2] = new Employee(3, "anh", "jenny", 16000);
        System.out.println(" danh sach nhan vien : ");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
        employees[0].raiseSalary(10);
        employees[1].raiseSalary(40);
        employees[2].raiseSalary(5);
        System.out.println("luong  sau khi tang : ");
        for( int i = 0; i< employees.length; i++){
            System.out.println(employees[i].toString());
        }
        System.out.println("nhan vien co muc luong cao nhat :");
        Employee bestSalary = employees[0];
        for( int i = 1; i< employees.length; i++){
            if(employees[i].getAnnualSalary() > bestSalary.getAnnualSalary()){
                    bestSalary = employees[i];
            }
        }
        System.out.println(bestSalary.toString());
    }
}
