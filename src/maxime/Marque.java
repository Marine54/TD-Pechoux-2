package maxime;

/**
 *
 * @author Maxime BLAISE
 */
public class Marque {
    
    /**
     * Le nom de la marque.
     */
    private String nom;

    /**
     * Constructeur d'une marque (en fonction de son nom).
     * 
     * @param nom le nom de la marque.
     */
    public Marque(String nom) {
        this.nom = nom;
    }
    
    @Override
    public boolean equals(Object o) {
        boolean egal = false;
        try {
            Marque marque = (Marque) o;
            if(this.nom.equals(marque.getNom())) {
                return true;
            }
        } catch(ClassCastException ex) {
            
        }
        
        return egal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
