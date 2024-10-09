package org.icesi.introjavafx.control;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.icesi.introjavafx.exceptions.PersonAlreadyCreatedException;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    // Recuperar el elemento de tipo Label que fue definido
    // en hello-view.fxml
    // Elementos graficos
    @FXML
    private Label welcomeText;
    @FXML
    private Label nameLabel;
    @FXML
    private Label codeLabel;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField codeTextField;

    // controlador del modelo
    private PersonController personController;

    //@FXML
    //protected void onHelloButtonClick() {
    //    welcomeText.setText("Welcome to JavaFX Application!");
    //    nameLabel.setText("Nombre: Estudiante 1");
    //}

    @FXML
    public void onRegisterUser() {
        String name = nameTextField.getText();
        String code = codeTextField.getText();

        try {
            personController.addPerson(name, code);
        }catch (PersonAlreadyCreatedException e){
            // con la excepción se lanza la alerta grafica
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Person Created");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
        welcomeText.setText(personController.printPeople());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        personController = new PersonController();
    }
}