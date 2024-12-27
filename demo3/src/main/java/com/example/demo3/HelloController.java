package com.example.demo3;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private TextField nametx, agetx, scoretx;
    @FXML
    private TableView<Student> tableView;
    @FXML
    private TableColumn<Student, String> namecol;
    @FXML
    private TableColumn<Student, Integer> agecol;
    @FXML
    private TableColumn<Student, Integer> scorecol;
    @FXML
    private void handleSaveStudent() {
        String name = nametx.getText();
        int age = Integer.parseInt(agetx.getText());
        int score = Integer.parseInt(scoretx.getText());
        Student student = new Student(name, age, score);
        students.add(student);
        tableView.getItems().add(student);
        nametx.clear();
        agetx.clear();
        scoretx.clear();
    }

    @FXML
    public void initialize() {

        namecol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        agecol.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getAge()).asObject());
        scorecol.setCellValueFactory(cellData -> new SimpleIntegerProperty((int) cellData.getValue().getScore()).asObject());
    }

    private List<Student> students = new ArrayList<>();


    @FXML
    private void handleBubbleSort() {

        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {

                if (students.get(j).getScore() < students.get(j + 1).getScore()) {

                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }


        tableView.getItems().setAll(students);
    }
        @FXML
    public void handleInsertionSort() {
            for (int i = 1; i < students.size(); i++) {
                Student currentStudent = students.get(i);
                int currentScore = (int) currentStudent.getScore();
                int j = i - 1;


                while (j >= 0 && students.get(j).getScore() < currentScore) {
                    students.set(j + 1, students.get(j));
                    j--;
                }


                students.set(j + 1, currentStudent);
            }


            tableView.getItems().setAll(students);


    }
    @FXML
    private void handleSelectionSort() {

        for (int i = 0; i < students.size() - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(j).getScore() < students.get(minIndex).getScore()) {
                    minIndex = j;
                }
            }
            Student temp = students.get(i);
            students.set(i, students.get(minIndex));
            students.set(minIndex, temp);
        }
        tableView.getItems().setAll(students);
    }
}
