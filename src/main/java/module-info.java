module com.example.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.project to javafx.fxml;
    exports com.example.project;

    opens com.example.project.test to junit;
}