import Controller.StaffController;
import Controller.StudentController;
import Entity.Gender;
import Entity.Staff;
import Entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("c24635","hai", LocalDate.of(2000,4,6), Gender.MALE,"Ha Noi"));
        students.add(new Student("c68957","Mai ",LocalDate.of(2001,1,13),Gender.OTHER,"Quang Ninh"));
        students.add(new Student("c84682","Lam ",LocalDate.of(1999,4,1),Gender.FEMALE,"Ninh Binh"));

        List<Staff> staffs = new ArrayList<>();
        staffs.add(new Staff(1,"huy","cap 1",5000,Gender.FEMALE,"Ha Noi"));
        staffs.add(new Staff(2,"hung","cap2",5500,Gender.FEMALE,"Ha Noi"));
        staffs.add(new Staff(1,"nga","cap 3",5600,Gender.MALE,"Ha Noi"));

        //hien thi thong tin hs tre nhat :
        StudentController sc = new StudentController(students);
        Optional<Student> studentYoungest = sc.getYoungest();
        System.out.println(studentYoungest);
        // tim hs theo ten
        StudentController.getByName("hai").forEach(System.out::println);
        //nv co tien luong cao nhat
        StaffController sc2 = new StaffController(staffs);
        Optional<Staff> staffMaxPay = sc2.getMaxPay();
        System.out.println(staffMaxPay);



    }

}