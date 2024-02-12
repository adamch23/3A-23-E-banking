package tn.group6.group6.services;
import tn.group6.group6.models.user;
import tn.group6.group6.utils.MyDatabase;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class userservice {
    Connection cnx = MyDatabase.getInstance().getCnx();


    public void ajouter(user u) {

        String request = "INSERT INTO `user`( `cin`, `Nom`, `Prenom`, `email`, `mdp`)  "
                + "VALUES (?,?,?,?,?)";


        try {
           // Connection connection = null;
            PreparedStatement ps = cnx.prepareStatement(request);
            ps.setInt(1, u.getCin());
            ps.setString(2, u.getNom());
            ps.setString(3, u.getPrenom());
            ps.setString(4, u.getEmail());
            ps.setString(5, u.getMdp());


            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }
    public void UpdateUser(user u) {
        try {
            String requeteUpdate = "UPDATE  user set `Cin`=?,`Nom`=?,`Prenom`=?,`email`=?,`mdp`=? where `id`=? ";


            PreparedStatement ps = cnx.prepareStatement(requeteUpdate);

            ps.setInt(1, u.getCin());
            ps.setString(2, u.getNom());
            ps.setString(3, u.getPrenom());
            ps.setString(4, u.getEmail());
            ps.setString(5, u.getMdp());
            ps.setInt(6, u.getId());

            ps.executeUpdate();
            System.out.println("modifée avec succés ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void deleteUser(int id) {
        try {
            String requete = " DELETE FROM User WHERE ID=?;";

            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println(" supprimée avec succés ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public void supprimer(int id) {
        try {
            String req = "DELETE FROM `user` WHERE id = " + id;

            Statement st = cnx.createStatement();
            ((Statement) st).executeUpdate(req);
            System.out.println("Utilisateur supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public List<user> afficheruser() {
        List<user> list_user = new ArrayList();
        try {
//WHERE id = " + id
            String requete = "SELECT * FROM user";
            PreparedStatement st = cnx.prepareStatement(requete);

            ResultSet rs = st.executeQuery(requete);
            while (rs.next()) {

                user ut = new user();
                ut.setCin(rs.getInt("Id"));
                ut.setCin(rs.getInt("cin"));
                ut.setNom(rs.getString("Nom"));
                ut.setPrenom(rs.getString("Prenom"));
                ut.setEmail(rs.getString("Email"));
                ut.setMdp(rs.getString("Mdp"));
                System.out.println("Utilisateur  !");

                list_user.add(ut);
            }
            System.out.println("Utilisateur  !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list_user;

    }


}
