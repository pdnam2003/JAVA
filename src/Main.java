import Entity.Department;
import Entity.Employee;
import Entity.Gender;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Department> departments = new ArrayList<Department>();
        List<Employee> employees = new ArrayList<>();
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
            departments.stream().forEach(department1 -> {
                Set<Employee> employeeSet = employees.stream()
                        .filter(employee->employee.getDepartment().getId()==department1.getId())
                        .collect(Collectors.toSet());
                countEmployee.put(department1.getCode(),(long)employeeSet.size());
                 } );
//            System.out.println(countEmployee);


            //count by Gender M
        Map<String,Long> countByGender = new HashMap<>();

        departments.stream().forEach(d -> {
            Set<Employee> empFemale = employees.stream()
                    .filter(e -> e.getGender() == Gender.F)
                    .collect(Collectors.toSet());
            countByGender.put(d.getCode(), (long)empFemale.size());
        });
        System.out.println(countByGender);

//        long maleCount = employees.stream()
//                .forEach(department2-> {
//                .filter(employee -> employee.getGender()==Gender.M)
//                .count()
//                });

//        countByGender.put(Gender.M, maleCount);



//
//            departments.stream().forEach(department -> {
//                Set<Employee> employeeSet = employees.stream()
//                        .filter(employee -> employee.getGender().equals(Gender.M))
//                        .collect(Collectors.toSet());
//                countByGender.put(Gender.M,(long)employeeSet.size());
////                });
//        System.out.println(countByGender);

    }
}