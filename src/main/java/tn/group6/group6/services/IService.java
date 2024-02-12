package tn.group6.group6.services;
import java.sql.SQLException;
import java.util.List;

    public interface IService <T> {
        public void ajouter(T C) throws SQLException ;
        public void supprimer(int id);
        public void modifier(T C);
        public List<T> getAll();
    }



