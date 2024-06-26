package com.oop.studentregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewController
{
    @FXML
    private TableColumn<Student, String> cgpaCol;

    @FXML
    private TableColumn<Student, String> idCol;

    @FXML
    private TableColumn<Student,String> majorCol;

    @FXML
    private TableColumn<Student, String> nameCol;

    @FXML
    private TableView<Student> studentTable;


    @javafx.fxml.FXML
    public void initialize() {
        idCol.setCellValueFactory(new PropertyValueFactory<Student,String>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
        majorCol.setCellValueFactory(new PropertyValueFactory<Student,String>("major"));
        cgpaCol.setCellValueFactory(new PropertyValueFactory<Student,String>("cgpa"));
    }

    @javafx.fxml.FXML
    public void addButtonOnClicked(ActionEvent actionEvent) {
        //studentTable.getItems().add(new Student(1,"John","CSE",3.5f));
    }
}