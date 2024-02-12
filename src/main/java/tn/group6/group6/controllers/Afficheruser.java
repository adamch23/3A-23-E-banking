package tn.group6.group6.controllers;

import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import tn.group6.group6.models.user;
import tn.group6.group6.services.userservice;

public class Afficheruser {


    @FXML
    private TableColumn<user, Integer> cincol;

    @FXML
    private TableColumn<user, String> emailcol;

    @FXML
    private TableColumn<user, String> mdpcol;

    @FXML
    private TableColumn<user, String> nomcol;

    @FXML
    private TableColumn<user, String> prenomcol;

    @FXML
    private TableView<user> tableview;

    @FXML
    void initialize() {
        userservice  userservice = new userservice();
        List<user> user=userservice.afficheruser();
        ObservableList<user> Observable= FXCollections.observableList(user);
        tableview.setItems(Observable);
        cincol.setCellValueFactory(new PropertyValueFactory<>("cin"));
        nomcol.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        prenomcol.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
        emailcol.setCellValueFactory(new PropertyValueFactory<>("email"));
        mdpcol.setCellValueFactory(new PropertyValueFactory<>("mdp"));




    }

}
