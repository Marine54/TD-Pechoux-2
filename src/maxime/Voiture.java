package maxime;

/**
 *
 * @author Maxime BLAISE
 */
public abstract class Voiture implements Copyright {

    /**
     * Numéro d'immatriculation.
     */
    private String numeroImmatriculation;

    /**
     * Marque de la voiture.
     */
    private Marque marque;

    /**
     * Age de la voiture.
     */
    private int age;

    /**
     * Age maximal de la voiture.
     */
    private int ageMaximal;

    /**
     * Défini si la voiture est en panne ou non.
     */
    private boolean enPanne;
    
    /**
     * Si elle est à la casse ou non.
     */
    private boolean aLaCasse;

    /**
     * Représente le nombre de voitures en circulation.
     */
    public static int nombreVoituresEnCirculation = 0;

    /**
     * Constructeur d'une voiture.
     *
     * @param numeroImmatriculation le numéro d'immatriculation
     * @param marque la marque de la voiture
     * @param ageMaximal l'âge maximal de la voiture
     */
    public Voiture(String numeroImmatriculation, Marque marque, int ageMaximal) {
        this.numeroImmatriculation = numeroImmatriculation;
        this.marque = marque;
        this.ageMaximal = ageMaximal;

        // Initialisation des autres variables
        this.age = 0;
        this.enPanne = false;
        this.aLaCasse = false;
        nombreVoituresEnCirculation++;
    }

    /**
     * Méthode qui affiche les caractéristiques d'une voiture.
     */
    public void afficherCaracteristiques() {
        System.out.println("Caractéristiques de la voiture n°" + this.numeroImmatriculation + " : ");
        System.out.println("..............................................");

        System.out.println("Marque      :      " + this.marque);
        System.out.println("Age         :      " + this.age);
        System.out.println("Age maximal :      " + this.ageMaximal);
    }

    /**
     * Méthode qui fait vieillir la voiture (défaut)
     * @throws TropVieilleException exception si elle est trop vieille
     */
    public void vieillir() throws TropVieilleException {
        vieillir(1);
    }

    /**
     * Méthode qui fait vieillir la voiture de XXX années.
     *
     * @param nombreAnnees le nombre d'années
     * @return vrai si le vieillisement est pris en compte
     * @throws TropVieilleException exception si elle est trop vieille
     */
    public boolean vieillir(int nombreAnnees) throws TropVieilleException{
        if (nombreAnnees > 0) {
            if(this.age == this.ageMaximal) {
                throw new TropVieilleException();
            }
            this.age += nombreAnnees;
            return true;
        }

        return false;
    }

    /**
     * Change le statut de la voiture (elle devient épave et part à la casse).
     */
    public void changerStatut() {
        this.enPanne = true;
        this.aLaCasse = true;
        // Il y a une voiture de moins en circulation.
        nombreVoituresEnCirculation--;
    }
    
    /**
     * Faire vrombir la voiture.
     */
    public abstract void faireVrombir();
    
    @Override
    public boolean estDeLaMarque(Marque o) {
        return this.marque.equals(o);
    }
    
    /**
     * Même marque + même age = voitures identiques
     * 
     * @param o l'object à comparer
     * @return vrai si les deux voitures sont identiques
     */
    @Override
    public boolean equals(Object o) {
        boolean egal = false;
        
        try {
            // Cast
            Voiture voiture = (Voiture)o;
            
            // Comparaison
            boolean memeMarque = this.marque.equals(voiture.getMarque());
            boolean memeAge = this.age == voiture.getAge();
            
            // Si identique
            if(memeAge && memeMarque) {
                egal = true;
            }
        } catch(ClassCastException e) {
            
        }
        
        return egal;
    }

    /**
     * Savoir si une voiture est en passe ou non.
     *
     * @return vrai si la voiture est en panne.
     */
    public boolean estEnPanne() {
        return this.enPanne;
    }

    public String getNumeroImmatriculation() {
        return numeroImmatriculation;
    }

    public void setNumeroImmatriculation(String numeroImmatriculation) {
        this.numeroImmatriculation = numeroImmatriculation;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeMaximal() {
        return ageMaximal;
    }

    public void setAgeMaximal(int ageMaximal) {
        this.ageMaximal = ageMaximal;
    }

    public boolean isEnPanne() {
        return enPanne;
    }

    public void setEnPanne(boolean enPanne) {
        this.enPanne = enPanne;
    }


    public boolean isaLaCasse() {
        return aLaCasse;
    }

    public void setaLaCasse(boolean aLaCasse) {
        this.aLaCasse = aLaCasse;
    }
    
    
    
}
