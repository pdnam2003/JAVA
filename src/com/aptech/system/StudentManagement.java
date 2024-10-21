package com.aptech.system;

import com.aptech.aprotrain.Student;

import java.util.Comparator;
import java.util.List;

public class StudentManagement {
        private List<Student> students;
        public  StudentManagement(){;}
        public  StudentManagement(List<Student> students){
            this.students = students;
        }
        public void addStudent(){
            for (int i = 0; i<3; i++){
                System.out.println("nhap thong sin hoc sinh can them so " + (i+1) +":");
                Student student = new Student();
                student.input();
                students.add(student);
            }
        }
        public void showStudent( ){
            students.forEach(System.out::println);
        }
        public List<Student> sortStudentByMark(){
            List<Student>sortedStd=students.stream()
                    .sorted(Comparator.comparingDouble(Student::getMark))
                    .toList();
            sortedStd.forEach(System.out::println);
            return sortedStd;
        }

}
