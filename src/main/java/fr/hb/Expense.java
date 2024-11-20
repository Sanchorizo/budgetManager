package fr.hb;

import java.util.Date;

public class Expense {

    String nom;
    Float montant;
    Date date;

    public Expense(Float montant, Date date, String nom) {
        this.montant = montant;
        this.date = date;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "nom='" + nom + '\'' +
                ", montant=" + montant +
                ", date=" + date +
                '}';
    }
}
