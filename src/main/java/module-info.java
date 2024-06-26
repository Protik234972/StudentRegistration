module com.oop.studentregistration {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.studentregistration to javafx.fxml;
    exports com.oop.studentregistration;
}