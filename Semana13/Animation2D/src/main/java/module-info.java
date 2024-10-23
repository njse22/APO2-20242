module org.icesi.animation2d {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.icesi.animation2d to javafx.fxml;
    exports org.icesi.animation2d;
}