package tn.group6.group6.models;

public class compte {
    private int num_compte;
    private int solde;
    private int devise;
    private int iduser;

    public compte(int num_compte, int solde, int devise, int iduser) {
        this.num_compte = num_compte;
        this.solde = solde;
        this.devise = devise;
        this.iduser = iduser;
    }

    public compte(int solde, int devise,int iduser) {
        this.solde = solde;
        this.devise = devise;
        this.iduser = iduser;
    }

    public compte() {}

    public int getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(int num_compte) {
        this.num_compte = num_compte;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public int getDevise() {
        return devise;
    }

    public void setDevise(int devise) {
        this.devise = devise;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Override
    public String toString() {
        return "compte{" +
                "num_compte=" + num_compte +
                ", solde=" + solde +
                ", iduser=" + iduser +
                ", devise=" + devise +
                '}';
    }
}
