package tn.group6.group6.models;

public class user {

    private int id;
    private int cin;
    private String Nom;
    private String Prenom;
    private String email;
    private String mdp;

    public user(int id, int cin, String Nom, String Prenom, String email, String mdp) {
        this.id = id;
        this.cin = cin;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.email = email;
        this.mdp = mdp;
    }

    public user(int cin, String Nom, String Prenom, String email, String mdp) {
        this.cin = cin;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.email = email;
        this.mdp = mdp;
    }

    public user() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", cin=" + cin +
                ", nom='" + Nom + '\'' +
                ", prenom='" + Prenom + '\'' +
                ", email='" + email + '\'' +
                ", mdp='" + mdp + '\'' +
                '}';
    }
    public String getPassword() {
        return mdp;
    }

    public void setPassword(String password) {
        this.mdp = mdp;
    }
}
