package org.icesi.tableview.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FormController {

    @FXML
    private TextField nameTf;
    @FXML
    private TextField idTf;
    @FXML
    private TextField ageTf;

    public void onAddPerson(){
        String name = nameTf.getText();
        String id = idTf.getText();
        int age = Integer.parseInt(ageTf.getText());

        PersonController controller = PersonController.getInstance();
        controller.addPerson(name, id, age);

    }

}
