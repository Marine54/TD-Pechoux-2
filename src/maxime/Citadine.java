package maxime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maxime
 */
public class Citadine extends Voiture {

    /**
     * Construit une Citadine avec l'immatriculation et la marque. L'âge maximal
     * de la voiture est 15 ans.
     *
     * @param immatriculation le numéro d'immatriculation
     * @param marque la marque de la voiture
     */
    public Citadine(String immatriculation, Marque marque) {
        super(immatriculation, marque, 15);
    }

    @Override
    public void faireVrombir() {
        System.out.println("boum");
    }
}
