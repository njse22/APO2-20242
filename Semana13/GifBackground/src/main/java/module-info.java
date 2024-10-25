module org.icesi.gifbackground {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.icesi.gifbackground to javafx.fxml;
    exports org.icesi.gifbackground;
}