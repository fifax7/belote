package belotte;

import java.util.ArrayList;

public class JeuTest {
	public ArrayList<Carte> paquetCarte = new ArrayList<Carte>();  
	
	
	public ArrayList<Carte> joueur1 = new ArrayList<Carte>();
    public ArrayList<Carte> joueur2 = new ArrayList<Carte>();
    public ArrayList<Carte> joueur3 = new ArrayList<Carte>();
    public ArrayList<Carte> joueur4 = new ArrayList<Carte>();
    
    
    /*on cree une liste de joueur pour connaitre l'ordre de passage */
    public ArrayList<ArrayList<Carte>> joueurs = new ArrayList<ArrayList<Carte>>();
	
    public Carte asCo = new Carte("rouge","coeur","as",32);
    public Carte asT = new Carte ("noir","trefle","as",32);

    
    public void prepareJeu() {
    	
    	for (int i = 0; i < 32; i++) {
    		paquetCarte.add(asCo);
    	}
    	joueurs.add(joueur1);
    	joueurs.add(joueur2);
    	joueurs.add(joueur3);
    	joueurs.add(joueur4);
    	
    }

    public void afficherJeu() {
    	int i = 1;
    	for(Carte carte : paquetCarte) {
    		System.out.print(i + " : ");
    		System.out.println(carte);
    		i +=1;
    	}
    	
    }
    
    public void ajouterCarteJoueur() {
    	
    	for (int j=0; j < 4; j++) {
    		for(int k=0; k<8; k++) { 
    			joueurs.get(j).add(asT);
    		}
    		
    	}
    }	
    public void afficherMain() {	
    	for (int j=0; j < 4; j++) {
    		int i = 1 ;
    		for(Carte carte : joueurs.get(j)) {
    			System.out.print(i + " : ");
    			System.out.println(carte);
    			i+=1;
    		}
    		
    	}
    	
    }
}


