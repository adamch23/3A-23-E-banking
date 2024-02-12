package tn.group6.group6.services;
import tn.group6.group6.models.compte;
import tn.group6.group6.utils.MyDatabase;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class compteservice {

    Connection cnx = MyDatabase.getInstance().getCnx();


    public void ajoutercompte(compte c) {

        String request = "INSERT INTO `compte`( `solde`, `devise`,`iduser`)  "
                + "VALUES (?,?,?)";


        try {
            // Connection connection = null;
            PreparedStatement ps = cnx.prepareStatement(request);
            ps.setInt(1, c.getSolde());
            ps.setInt(2, c.getDevise());
            ps.setInt(3, c.getIduser());

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }
    public void Updatecompte(compte c) {
        try {
            String requeteUpdate = "UPDATE  compte set `solde`=?,`devise`=?,`iduser`=? where `num_compte`=? ";


            PreparedStatement ps = cnx.prepareStatement(requeteUpdate);

            ps.setInt(1, c.getSolde());
            ps.setInt(2, c.getDevise());
            ps.setInt(3, c.getNum_compte());

            ps.executeUpdate();
            System.out.println("modifée avec succés ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void deletecompte(int Num_compte) {
        try {
            String requete = " DELETE FROM compte WHERE Num_compte=?;";

            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setInt(1, Num_compte);

            ps.executeUpdate();
            System.out.println(" supprimée avec succés ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public void supprimercompte(int Num_compte) {
        try {
            String req = "DELETE FROM `compte` WHERE Num_compte = " + Num_compte;

            Statement st = cnx.createStatement();
            ((Statement) st).executeUpdate(req);
            System.out.println("Utilisateur supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public List<compte> affichercompte() {
        List<compte> listcompte = new ArrayList();
        try {
//WHERE id = " + id
            String requete = "SELECT * FROM compte";
            PreparedStatement st = cnx.prepareStatement(requete);

            ResultSet rs = st.executeQuery(requete);
            while (rs.next()) {

                compte ct = new compte();
                ct.setNum_compte(rs.getInt("Num_compte"));
                ct.setSolde(rs.getInt("solde"));
                ct.setDevise(rs.getInt("devise"));
                ct.setDevise(rs.getInt("iduser"));

                System.out.println("compte  !");

                listcompte.add(ct);
            }
            System.out.println("compte  !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return listcompte;

    }


}






