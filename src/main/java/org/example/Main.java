package org.example;

public class Main {
    public static void main(String[] args) {

       //Créer une instance de GestionnaireDePrets pour manipuler les prêts
        GestionnaireDePrets<Pret> gestionnaireDePrets = new GestionnaireDePrets<>();

        //Ajouter des prêts de différents types
        gestionnaireDePrets.ajourterPet(new PretImmobilier("P001", 200000.0, 0.03, 20));
        gestionnaireDePrets.ajourterPet(new PretEtudiant("P002", 15000.0, 0.02, true));
        gestionnaireDePrets.ajourterPet(new PretPersonnel("P003", 5000.0, 0.05, "Voyage"));

        //Afficher la liste des prêts
        System.out.println("Liste des prêts : ");
        for (Pret pret : gestionnaireDePrets.listerPrets()) {
            System.out.println(pret);
        }

        //Afficher le nombre total de prêts
        System.out.println("Le nombre total de pets : " + gestionnaireDePrets.compterPrets());

        //Retirer un prêt
        Pret pretRetire = gestionnaireDePrets.retirerPret();
        System.out.println("Retrait du prêt : " + pretRetire);

        //Afficher la liste mise à jour
        System.out.println("Liste mise à jour :");
        for (Pret pret : gestionnaireDePrets.listerPrets()) {
            System.out.println(pret);
        }
    }
}
