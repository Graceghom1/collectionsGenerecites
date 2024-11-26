package org.example;

public class PretEtudiant extends Pret {
    private boolean différé;

    public PretEtudiant(String id, double montant, double tauxInteret, boolean différé) {
        super(id, montant, tauxInteret);
        this.différé = différé;
    }

    @Override
    public double calculerInteret() {
        if (différé) {
            return montant * tauxInteret;
        } else {
            return montant * tauxInteret * 5;
        }
    }

    @Override
    public String toString() {
        return "PretEtudiant{" + super.toString() +
                ", différé=" + différé +
                ", interet=" + calculerInteret() +
                "}";
    }
}

