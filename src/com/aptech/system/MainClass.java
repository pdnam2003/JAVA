package com.aptech.system;

import com.aptech.aprotrain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        StudentManagement studentManagement = new StudentManagement(students);

        students.add(new Student(1, "Nguyen Van A", "vana@example.com", 8.5f));
        students.add(new Student(2, "Tran Thi B", "thib@example.com", 7.0f));
        students.add(new Student(3, "Le Van C", "vanc@example.com", 5.5f));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU ===\n" +
                    "1.Add New.\n" +
                    "2.Show All.\n" +
                    "3.Sort By Mark.\n" +
                    "4.Exit.\n" +
                    "Your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    studentManagement.addStudent();

                    break;
                case 2:
                    studentManagement.showStudent();

                    break;
                case 3:
                    studentManagement.sortStudentByMark();

                    break;

                case 4:
                    System.out.println("Exit program");
                   return;
                default:
                    System.out.println("error");

            }
        }

    }

}
