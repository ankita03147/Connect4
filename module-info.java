module com.example.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.connect4 to javafx.fxml;
    exports com.company.connect4;
}