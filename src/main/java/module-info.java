module com.example.programaciontres {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.programaciontres to javafx.fxml;
    exports com.example.programaciontres;
}