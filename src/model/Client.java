package model;

public class Client {
    boolean retard = false;
    private int idClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String typeClient;
    private int dureeMaximumPret;

    public Client ( int idClient , String nom , String prenom , String adresse ,
                    String typeClient , int dureeMaximumPret ) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.typeClient = typeClient;
        this.dureeMaximumPret = dureeMaximumPret;
    }

    public Client () {
    }

    public int getIdClient () {
        return idClient;
    }

    public void setIdClient ( int idClient ) {
        this.idClient = idClient;
    }

    public String getNom () {
        return nom;
    }

    public void setNom ( String nom ) {
        this.nom = nom;
    }

    public String getPrenom () {
        return prenom;
    }

    public void setPrenom ( String prenom ) {
        this.prenom = prenom;
    }

    public String getAdresse () {
        return adresse;
    }

    public void setAdresse ( String adresse ) {
        this.adresse = adresse;
    }

    public String getTypeClient () {
        return typeClient;
    }

    public void setTypeClient ( String typeClient ) {
        this.typeClient = typeClient;
    }

    public int getDureeMaximumPret () {
        return dureeMaximumPret;
    }

    public void setDureeMaximumPret ( int dureeMaximumPret ) {
        this.dureeMaximumPret = dureeMaximumPret;
    }


    public void ajouterClient ( Client client ) {

    }

    public void supprimerClientParId ( int id ) {

    }

    public void modifierClient ( int id ) {

    }

    public void rechercherClient ( String nom , String prenom ) {

    }


    @Override
    public String toString () {
        return "Client{" +
                "idClient=" + idClient +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", typeClient='" + typeClient + '\'' +
                ", dureeMaximumPret=" + dureeMaximumPret +
                ", retard=" + retard +
                '}';
    }
}
