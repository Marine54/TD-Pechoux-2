package maxime;

/**
 *
 * @author Maxime BLAISE
 */
public class TestVoitures {

    /**
     * Méthode principale.
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        // Création des marques
        Marque toyota = new Marque("Toyota");
        Marque renault = new Marque("Renault");
        Marque peugeot = new Marque("Peugeot");

        // Création d'un tableau de voiture
        Voiture[] voitures = new Voiture[3];
        voitures[0] = new Citadine("AA-54-BB", toyota);
        voitures[1] = new Monospace("CC-57-DD", renault, 7);
        voitures[2] = new Citadine("EE-60-FF", peugeot);

        // Parcours pour faire vrombir les moteurs
        for (Voiture v : voitures) {
            v.faireVrombir();
        }

        // Parcours d'affichage
        for (Voiture v : voitures) {
            affiche(v);
        }

        class Mini extends Citadine {

            /**
             * Nombre de portes de la mini.
             */
            private int nombrePortes;

            /**
             * Construit une mini.
             *
             * @param immatriculation numéro de la plaque d'immatrication
             * @param marque marque de la mini
             */
            public Mini(String immatriculation, Marque marque, int nbPortes) {
                super(immatriculation, marque);
                this.nombrePortes = nbPortes;
            }

            public int getNombrePortes() {
                return nombrePortes;
            }

            public void setNombrePortes(int nombrePortes) {
                this.nombrePortes = nombrePortes;
            }

        }

        // Test d'utilisation de la classe Mini
        Mini mini = new Mini("FF-55-GG", renault, 3);
        System.out.println("Voiture " + mini.getNumeroImmatriculation() + " avec " + mini.getNombrePortes() + "portes.");

        Monospace m = new Monospace("ER-50-GR", peugeot, 20) {
            @Override
            public void faireVrombir() {
                System.out.println("bling bling");
            }
        };
        m.faireVrombir();

    }

    /**
     * Méthode qui affiche voiture si l'objet passé en paramètre est une voiture
     *
     * @param o Object
     */
    public static void affiche(Object o) {
        if (o instanceof Voiture) {
            System.out.println("Voiture");
        }
    }

    /**
     * Méthode qui affiche mono si l'objet passé en paramètre est un monospace
     *
     * @param m un monospace
     */
    public static void affiche(Monospace m) {
        System.out.println("Monospace");
    }

}
