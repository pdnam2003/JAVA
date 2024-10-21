package com.aptech.aprotrain;

import com.aptech.aprotrain.IStudent;

import java.util.Scanner;

public class Student implements IStudent {
    private int id;
    private String fullname;
    private String email;
    private float mark;

    public Student(){;}

    public Student(int id, String fullname, String email, float mark) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public void input() {

            System.out.println("Nhap tung thong tin doi tuong :");
            Scanner scanner  = new Scanner(System.in);

            System.out.println("nhap id:");
            this.id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("nhap fullname:");
            this.fullname = scanner.nextLine();

            System.out.println("nhap email:");
            this.email = scanner.nextLine();

            System.out.println("nhap mark:");
            this.mark = scanner.nextFloat();
            scanner.nextLine();

    }

    @Override
    public void display() {
       System.out.println("Student " +"id=" + id + ", fullname='" + fullname + '\'' + ", email='" + email + '\'' +  ", mark=" + mark + '}');

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", mark=" + mark +
                '}';
    }
}
