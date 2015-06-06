package maxime;

/**
 *
 * @author Maxime BLAISE
 */
public class Monospace extends Voiture {

    /**
     * La capacité maximale de place.
     */
    private int capaciteMaximale;

    /**
     * Construit une Citadine avec l'immatriculation et la marque. L'âge maximal
     * de la voiture est 15 ans.
     *
     * @param immatriculation le numéro d'immatriculation
     * @param marque la marque de la voiture
     * @param capacite la capacité maximale de place
     */
    public Monospace(String immatriculation, Marque marque, int capacite) {
        super(immatriculation, marque, 20);
        this.capaciteMaximale = capacite;
    }

    public int getCapaciteMaximale() {
        return capaciteMaximale;
    }

    public void setCapaciteMaximale(int capaciteMaximale) {
        this.capaciteMaximale = capaciteMaximale;
    }

    @Override
    public void faireVrombir() {
        System.out.println("vroum vroum");
    }

}
