module org.icesi.introjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.icesi.introjavafx to javafx.fxml;
    exports org.icesi.introjavafx;
    exports org.icesi.introjavafx.control;
    opens org.icesi.introjavafx.control to javafx.fxml;
}