package com.example.lab5;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class StudentController {

    public TextField studentName, studentYear, studentMajor;
    public Label errorLabel;
    public ListView<Student> list;


    public void createProfile() {
        String name = studentName.getText();
        String year = studentYear.getText();
        String major = studentMajor.getText();

        if (studentName.getText().isEmpty()) {
            errorLabel.setText("Error: Name empty");
            return;
        } else if (studentYear.getText().isEmpty()) {
            errorLabel.setText("Error: Year empty");
            return;
        } else if (studentMajor.getText().isEmpty()) {
            errorLabel.setText("Error: Major empty");
            return;
        }
        Student theStudent = new Student(name, year, major);
        list.getItems().add(theStudent);


    }
    public void removeStudent() {
        Student theStudent = list.getSelectionModel().getSelectedItem();
        list.getItems().remove(theStudent);
    }
}