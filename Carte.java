
public class Carte {
    private String  couleur;
    private String motif;
    private String nb;
    private int typeJeu;
    private int point;
    
    

    public Carte( String couleur, String motif, String nb,int point, int typeJeu ){

        this.couleur= couleur;
        this.motif= motif;
        this.nb = nb;
        this.typeJeu = typeJeu;
        this.point = point;

    }
    public String getCouleur(){
        return this.couleur;

    }
    public String getMotif(){
        return this.motif;
    
    }
    public int getTypeJeu(){
        return this.typeJeu;
    }
    public String getNb(){
        return this.nb;
    }
    public int getpoint(){
        return this.point;
    }


    public void setCouleur(String couleur){
        this.couleur= couleur;
    }
    public  void setMotif(String motif){
        this.motif=motif;
    }
    public void setTypeJeu(int typeJeu){
        this.typeJeu= typeJeu;
    }
    
    public void setnb(String nb){
        this.nb= nb;
    } 
    public void setPoint(int point){
        this.point=point;
    }


    public String toString(){
        return "la carte est le "+this.nb+" de " +this.motif;
    }
   
    
}
