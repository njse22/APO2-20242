package org.icesi.tableview.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.icesi.tableview.HelloApplication;
import org.icesi.tableview.model.Person;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TableView<Person> peopleTv;
    @FXML
    private TableColumn<Person, String> nameTC;
    @FXML
    private TableColumn<Person, String> idTC;
    @FXML
    private TableColumn<Person, Integer> ageTC;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameTC.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        idTC.setCellValueFactory(new PropertyValueFactory<Person, String>("id"));
        ageTC.setCellValueFactory(new PropertyValueFactory<Person, Integer>("age"));

        peopleTv.setItems(PersonController.getInstance().getPeople());

    }

    public void onAddPerson() {
        HelloApplication.openWindow("form-view.fxml");
    }
}