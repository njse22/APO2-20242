module org.icesi.tableview {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.icesi.tableview to javafx.fxml;
    opens org.icesi.tableview.model to javafx.fxml;
    exports org.icesi.tableview.model;
    exports org.icesi.tableview;
    exports org.icesi.tableview.controller;
    opens org.icesi.tableview.controller to javafx.fxml;
}