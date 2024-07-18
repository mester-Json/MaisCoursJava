package Employe;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    private List<Employe> employes;

    public Personnel() {
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public void calculerSalaires() {
        for (Employe employe : employes) {
            System.out.println(employe.getNom() + " a un salaire de " + employe.calculerSalaire() + " Euros.");
        }
    }

    public double salaireMoyen() {
        double totalSalaire = 0;
        for (Employe employe : employes) {
            totalSalaire += employe.calculerSalaire();
        }
        return totalSalaire / employes.size();
    }
}
