package org.example;

public abstract class Pret {

    protected String id;
    protected double montant;
    protected double tauxInteret;

    public Pret(String id, double montant, double tauxInteret) {
        this.id = id;
        this.montant = montant;
        this.tauxInteret = tauxInteret;

    }

    //Méthode abstraite pour calculer les intérêts, à implémenter dans les sous-classes
    public abstract double calculerInteret();

    @Override
    public String toString() {
        return "Pret{" +
                "id='" + id + '\'' +
                ", montant=" + montant +
                ", tauxInteret=" + tauxInteret +
                '}';
    }
}

