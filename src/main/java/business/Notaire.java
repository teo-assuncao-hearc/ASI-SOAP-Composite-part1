package business;

public class Notaire {

    private String titre;
    private String nom;
    private String prenom;
    private String adresse;
    private String residenceNotariale;
    private String email;

    public Notaire(String titre, String nom, String prenom, String adresse, String residenceNotariale, String email) {
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.residenceNotariale = residenceNotariale;
        this.email = email;
    }

    // Getters and Setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getResidenceNotariale() {
        return residenceNotariale;
    }

    public void setResidenceNotariale(String residenceNotariale) {
        this.residenceNotariale = residenceNotariale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
