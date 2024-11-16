module org.icesi.testmap {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.icesi.testmap to javafx.fxml;
    exports org.icesi.testmap;
}