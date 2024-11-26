package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireDePrets<T> {
    private List<T> prets;

    public GestionnaireDePrets() {
        prets = new ArrayList<>();
    }

    //Ajouter un prêt à la liste
    public void ajourterPet(T pret) {
        prets.add(pret);
    }

    //Retirer le premier prêt de la liste
    public T retirerPret() {
        if (!prets.isEmpty()) {
            return prets.remove(0);
        }
        return null;
    }

    //Retourner tous les prêts dans la liste
    public List<T> listerPrets() {
        return prets;
    }

    //Retourner le nombre total de prêts
    public int compterPrets() {
        return prets.size();
    }
}
