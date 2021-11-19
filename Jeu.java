import java.util.*;


;public class Jeu {
    public ArrayList<Carte> paquetCarte = new ArrayList<Carte>();
    public ArrayList<Carte> joueur1 = new ArrayList<Carte>();
    public ArrayList<Carte> joueur2 = new ArrayList<Carte>();
    public ArrayList<Carte> joueur3 = new ArrayList<Carte>();
    public ArrayList<Carte> joueur4 = new ArrayList<Carte>();
    public ArrayList<ArrayList<Carte>> joueurs = new ArrayList<ArrayList<Carte>>();
    public Scanner saisieUtilisateur = new Scanner(System.in);

        public Carte asCo = new Carte("rouge","coeur","as",32);
        public Carte asCa = new Carte("rouge","carreaux","as",32);
        public Carte asP = new Carte ("noir","pique","as",32);
        public Carte asT = new Carte ("noir","trefle","as",32);
        public Carte roiCo = new Carte("rouge","coeur","roi",32);
        public Carte roiCa = new Carte("rouge","carreaux","roi",32);
        public Carte roiP = new Carte ("noir","pique","roi",32);
        public Carte roiT = new Carte ("noir","trefle","roi",32);
        public Carte dameCo = new Carte("rouge","coeur","dame",32);
        public Carte dameCa = new Carte("rouge","carreaux","dame",32);
        public Carte dameP = new Carte ("noir","pique","dame",32);
        public Carte dameT = new Carte ("noir","trefle","dame",32);
        public Carte valaisCo = new Carte("rouge","coeur","valais",32);
        public Carte valaisCa = new Carte("rouge","carreaux","valais",32);
        public Carte valaisP = new Carte ("noir","pique","valais",32);
        public Carte valaisT = new Carte ("noir","trefle","valais",32);
        public Carte dixCo = new Carte("rouge","coeur","dix",32);
        public Carte dixCa = new Carte("rouge","carreaux","dix",32);
        public Carte dixP = new Carte ("noir","pique","dix",32);
        public Carte dixT = new Carte ("noir","trefle","dix",32);
        public Carte neufCo = new Carte("rouge","coeur","neuf",32);
        public Carte neufCa = new Carte("rouge","carreaux","neuf",32);
        public Carte neufP = new Carte ("noir","pique","neuf",32);
        public Carte neufT = new Carte ("noir","trefle","neuf",32);
        public Carte huitCo = new Carte("rouge","coeur","huit",32);
        public Carte huitCa = new Carte("rouge","carreaux","huit",32);
        public Carte huitP = new Carte ("noir","pique","huit",32);
        public Carte huitT = new Carte ("noir","trefle","huit",32);
        public Carte septCo = new Carte("rouge","coeur","sept",32);
        public Carte septCa = new Carte("rouge","carreaux","sept",32);
        public Carte septP = new Carte ("noir","pique","sept",32);
        public Carte septT = new Carte ("noir","trefle","sept",32);

    public void jeuJeu(){
        System.out.println("debut du jeu");
        Jeu x = new Jeu() ;
        x.preparerjeu();
        x.distribuerJeu();
        x.atoutChoixJeu();
        
    }

    public void preparerjeu(){


    
        paquetCarte.add(asCo);
        paquetCarte.add(asCa);
        paquetCarte.add(asP);
        paquetCarte.add(asT);

        paquetCarte.add(roiCo);
        paquetCarte.add(roiCa);
        paquetCarte.add(roiP);
        paquetCarte.add(roiT);

        paquetCarte.add(dameCo);
        paquetCarte.add(dameCa);
        paquetCarte.add(dameP);
        paquetCarte.add(dameT);

        paquetCarte.add(valaisCo);
        paquetCarte.add(valaisCa);
        paquetCarte.add(valaisP);
        paquetCarte.add(valaisT);

        paquetCarte.add(dixCo);
        paquetCarte.add(dixCa);
        paquetCarte.add(dixP);
        paquetCarte.add(dixT);

        paquetCarte.add(neufCo);
        paquetCarte.add(neufCa);
        paquetCarte.add(neufP);
        paquetCarte.add(neufT);

        paquetCarte.add(huitCo);
        paquetCarte.add(huitCa);
        paquetCarte.add(huitP);
        paquetCarte.add(huitT);

        paquetCarte.add(septCo);
        paquetCarte.add(septCa);
        paquetCarte.add(septP);
        paquetCarte.add(septT);

       Collections.shuffle(paquetCarte);


    }
    public void distribuerCarte(ArrayList<Carte> joueur, int nb){
        for(int i=0; i<nb ; i++){
            joueur.add(paquetCarte.get(1));
            paquetCarte.remove(paquetCarte.get(1));
        }
    }

       public void distribuerIerTourJeu(){
        Jeu t = new Jeu() ;
        t.preparerjeu();
        for(ArrayList<Carte> joueur : joueurs){
            t.distribuerCarte(joueur, 3);
        }
        for(ArrayList<Carte> joueur : joueurs){
            t.distribuerCarte(joueur, 2);
        }


    }
    public void atoutChoixJeu(){
        Jeu t = new Jeu();
        String str= "pas encore" ;
        for(ArrayList<Carte> joueur : joueurs){
            while (str != "oui")
            System.out.println(paquetCarte.get(1).toString());
            System.out.println("------------");
            System.out.println("tu a : ");
            for(Carte i:joueur){
                System.out.println(i.toString());
            }
            System.out.println("voulez vous prendre ?");
            String str= saisieUtilisateur.next();
            if(str=="oui"){
                t.distribuerCarte(joueur1, 1);
                t.distribuerdemeTour();

            }
        }
    
    }
    public void distribuerdemeTour(){
        Jeu t = new Jeu() ;
        for(ArrayList<Carte> joueur : joueurs){
            t.distribuerCarte(joueur, 8-joueur.size());


  }
}
