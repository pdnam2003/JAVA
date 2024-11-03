import Entity.Department;
import Entity.Employee;
import Entity.Gender;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Department> departments = new ArrayList<Department>();
        List<Employee> employees = new ArrayList<Employee>();
        departments.add(new Department(1,"HR","Human Resource"));
        departments.add(new Department(2,"IT","INformation Technology"));
        employees.add(new Employee(1,"Lo Van Hieu",departments.get(0), LocalDate.of(2000,1,12), Gender.M));
        employees.add(new Employee(2,"Nguyen Hieu",departments.get(0),LocalDate.of(1999,1,21),Gender.M));
        employees.add((new Employee(3," Dat Nguyen",departments.get(1),LocalDate.of(2000,2,3),Gender.F)));


        Map<String,Long> countEmployee = new HashMap<>();

        departments.stream().forEach(department -> {
            long totalEmp = employees.stream()
                    .filter(emp -> department.getId() == emp.getDepartment().getId())
                    .collect(Collectors.toSet())
                    .stream().count();
            countEmployee.put(department.getCode(), totalEmp);
        });
//            System.out.println(countEmployee);
        /*getOrDefault(base on Count() must be unique,0)+1;iterator in MapEntry
         *way 2
         **/
        departments.forEach(d->{
            employees.stream()
                    .filter(emp-> emp.getDepartment().getId()== d.getId())
                    .map(employee -> {  //peek no need to return object
                        return countEmployee.put(d.getCode(),countEmployee.getOrDefault(d.getCode(),0L)+1);
                    });
        });
//            System.out.println(countEmployee);
        /*
         *way 3 : using Set<Object> vs size() convert dataType to Long
         *
         *  */
        departments.forEach(d1 -> {
            Set<Employee> employeeSet = employees.stream()
                    .filter(employee->employee.getDepartment().getId()==d1.getId())
                    .collect(Collectors.toSet());
            countEmployee.put(d1.getCode(),(long)employeeSet.size());
        } );
//            System.out.println(countEmployee);


        //count by Gender M
        Map<String, Long> countMaleEmployees = new HashMap<>();
        departments.forEach(department -> {
            long maleEmpCount = employees.stream()
                    .filter(emp -> emp.getDepartment().getId() == department.getId() &&
                            emp.getGender() == Gender.M)
                    .count();
            countMaleEmployees.put(department.getCode(), maleEmpCount);
        });
        System.out.println(countMaleEmployees);

    }
}