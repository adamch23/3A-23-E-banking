package tn.group6.group6.test;
import tn.group6.group6.models.compte;
import tn.group6.group6.models.user;
import tn.group6.group6.services.compteservice;
import tn.group6.group6.utils.MyDatabase;
import tn.group6.group6.services.userservice;

public class Main {
    public static void main(String[] args){
        MyDatabase db;
        userservice us =new userservice();
        compteservice ss =new compteservice();
        db = new MyDatabase.getInstance();
        MyDatabase db2;
        db2 = new MyDatabase.getInstance();
        System.out.println(db);
        System.out.println(db2);
         ss.ajoutercompte(new compte(53,344,1));
      //  ss.supprimercompte(3);
    ss.affichercompte();
        // us.ajouter(new user(2253,"chaibi","anis","adamgf@.er","ijlk")) ;
      //  us.UpdateUser(new user(3,13,"CH","adam","adamgf@.er","ijlk")) ;
     // System.out.println(us.afficheruser()) ;

}}
