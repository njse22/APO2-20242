module org.icesi.colisiones {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.icesi.colisiones to javafx.fxml;
    exports org.icesi.colisiones;
}