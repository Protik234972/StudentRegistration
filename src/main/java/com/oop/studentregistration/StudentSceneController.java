package com.oop.studentregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class StudentSceneController {

    @FXML
    private TableColumn<Dummy,String> courseCol;

    @FXML
    private ComboBox<String> courseComboBox;

    @FXML
    private TableColumn<Dummy, String> creditCol;

    @FXML
    private TextField creditsTextField;

    @FXML
    private CheckBox hasScholarshipCheckBox;

    @FXML
    private TableColumn<Dummy, String> idCol;

    @FXML
    private TextField idTextField;

    @FXML
    private RadioButton labRadio;

    @FXML
    private TextArea resultTextArea;

    @FXML
    private TextField scholarshipTextField;

    @FXML
    private ComboBox<String> section2ComboBox;

    @FXML
    private TableColumn<Dummy,String> sectionCol;

    @FXML
    private ComboBox<String> sectionComboBox;

    @FXML
    private TableView<Dummy> student;

    @FXML
    private RadioButton theoryRadio;

    @FXML
    private Label totallAmountLabel;

    ToggleGroup tg;
    ArrayList<Registration> registrations;
    ArrayList<Dummy> dummy;
    int[] credit = {3,3,3,3,3,1,1,1,1,1};
    @javafx.fxml.FXML
    public void initialize(){
        courseComboBox.setValue("Course");
        courseComboBox.getItems().addAll("CSE101","CSE102","CSE103","CSE104","CSE105",
                                                    "CSE101L","CSE102L","CSE103L","CSE104L","CSE105L");
        sectionComboBox.setValue("Section");
        sectionComboBox.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
        section2ComboBox.setValue("Section");
        section2ComboBox.getItems().addAll("1","2","3","4","5","6","7","8","9","10");



        tg = new ToggleGroup();
        labRadio.setToggleGroup(tg);
        theoryRadio.setToggleGroup(tg);
        scholarshipTextField.setText("0");
        scholarshipTextField.setDisable(true);
        registrations = new ArrayList<>();
        dummy = new ArrayList<>();

        //Automatic credit setting


        idCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        courseCol.setCellValueFactory(new PropertyValueFactory<>("courseId"));
        creditCol.setCellValueFactory(new PropertyValueFactory<>("courseCredit"));
        sectionCol.setCellValueFactory(new PropertyValueFactory<>("section"));


    }

    @FXML
    void addCourseButton(ActionEvent event) {
        registrations.add(new Registration(courseComboBox.getValue(),
                Integer.parseInt(creditsTextField.getText()),
                Integer.parseInt(sectionComboBox.getValue())));


            creditsTextField.clear();
    }

    @FXML
    void registerButton(ActionEvent event) {
        student.getItems().clear();
       for(Registration r:registrations){
           dummy.add(new Dummy(Integer.parseInt(idTextField.getText()),
                   r.getCourseId(),
                   r.getCourseCredit(),
                   r.getSection()));
       }
         student.getItems().addAll(dummy);
    }

    @FXML
    void showSelectedCourseButton(ActionEvent event) {
        int count = 0 ;
        if (theoryRadio.isSelected()) {
            for (Dummy d : dummy) {
                if (d.getCourseCredit() ==3 && d.getSection()==Integer.parseInt(section2ComboBox.getValue())) {

                    count += 1;
                }
            }
        }
        else if(labRadio.isSelected()){
            for (Dummy d : dummy) {
                if (d.getCourseCredit() ==1 && d.getSection()==Integer.parseInt(section2ComboBox.getValue()))
                {count += 1;}
            }

        }

        resultTextArea.setText("number of "+section2ComboBox.getValue()+"selected courses: "+count);

    }

    @FXML
    public void hasScholarshipCheckBoxSelected(ActionEvent actionEvent) {
        scholarshipTextField.setDisable(!hasScholarshipCheckBox.isSelected());
    }

    @FXML
    public void courseComboBoxClicked(ActionEvent actionEvent) {
        creditsTextField.setText(
                Integer.toString(
                        credit[courseComboBox.getItems().indexOf(courseComboBox.getValue())
                                ]
                )
        );
    }
}