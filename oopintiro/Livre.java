package oopintiro;

public class Livre {
    private String Titre;
    public String getTitre() {
        return Titre;
    }
    public void setTitre(String titre) {
        Titre = titre;
    }
    private String Auteur;
    public String getAuteur() {
        return Auteur;
    }
    public void setAuteur(String auteur) {
        Auteur = auteur;
    }
    private int NbPages;
    public int getNbPages() {
        return NbPages;
    }
    public void setNbPages(int nbPages) {
        NbPages = nbPages;
    }

    public Livre(String T,String A,int P){
        this.Titre=T;
        this.Auteur = A;
        this.NbPages=P;
    }
    public Livre(String T,String A){
        this.Titre=T;
        this.Auteur = A;
    
    }
    public Livre(){
        this.Titre="titre";
        this.Auteur ="auteu";
        this.NbPages=0;
    }
    @Override
    public String toString() {
        return "[" + Titre + "/" + Auteur + "/" + NbPages + "]";
    }


}
