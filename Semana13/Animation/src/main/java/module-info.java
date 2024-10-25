module org.icesi.animation {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.icesi.animation to javafx.fxml;
    exports org.icesi.animation;

    opens org.icesi.animation.model to javafx.fxml;
    exports org.icesi.animation.model;

    opens org.icesi.animation.screens to javafx.fxml;
    exports org.icesi.animation.screens;

    exports org.icesi.animation.control;
    opens org.icesi.animation.control to javafx.fxml;
}