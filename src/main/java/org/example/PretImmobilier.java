package org.example;

public class PretImmobilier extends Pret {

    private int duree;

    public PretImmobilier(String id, double montant, double tauxInteret, int duree) {
        super(id, montant, tauxInteret);
        this.duree = duree;
    }

    @Override
    public double calculerInteret() {
        return montant * tauxInteret * duree;
    }

    @Override
    public String toString() {
        return "PretImmobilier{" + super.toString() + ", duree=" + duree + ", interet=" + calculerInteret() + "}";

    }
}

