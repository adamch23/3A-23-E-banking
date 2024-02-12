package tn.group6.group6.controllers;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

import tn.group6.group6.models.user;
import tn.group6.group6.services.userservice;
import tn.group6.group6.test.HelloApplication;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;

public class Ajouteruser {

        @FXML
        private TextField NomTF;

        @FXML
        private TextField cinTF;

        @FXML
        private TextField emailTF;

        @FXML
        private TextField mdpTF;

        @FXML
        private TextField prenomTF;


        @FXML

        public void ajouteruser(javafx.event.ActionEvent actionEvent) {userservice userservice =new userservice();
                user user = new user();
                user.setEmail(emailTF.getText());
                user.setPrenom(prenomTF.getText());
                try {
                        int cin = Integer.parseInt(cinTF.getText());
                        user.setCin(cin);
                } catch (NumberFormatException e) {
                        // Handle the case where the text cannot be parsed as an integer
                        // This could be due to invalid input in the text field
                        // You can display an error message or take appropriate action here
                }
                user.setNom(NomTF.getText());
                user.setMdp(mdpTF.getText());

                userservice.ajouter(user);
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("success");
                alert.setContentText("Personne ajoutée");
                alert.showAndWait();
        }



        public void afficheruser(javafx.event.ActionEvent actionEvent) throws IOException{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/tn/group6/group6/Afficheruser.fxml"));
                cinTF.getScene().setRoot(fxmlLoader.load());
        }
}


