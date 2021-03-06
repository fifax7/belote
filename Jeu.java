package h;

import java.util.*;


public class Jeu {

    /* on cree un paquet de carte */
    public ArrayList<Carte> paquetCarte = new ArrayList<Carte>();
    /*on cree un paquet pour chaque joueur*/
    public ArrayList<Carte> joueur1 = new ArrayList<Carte>();
    public ArrayList<Carte> joueur2 = new ArrayList<Carte>();
    public ArrayList<Carte> joueur3 = new ArrayList<Carte>();
    public ArrayList<Carte> joueur4 = new ArrayList<Carte>();
    /*on cree une liste de joueur pour connaitre l'ordre de passage */
    public ArrayList<ArrayList<Carte>> joueurs = new ArrayList<ArrayList<Carte>>();

    /*on cree les deux equipes*/
    public ArrayList<ArrayList<Carte>> premiereEquipe = new ArrayList<ArrayList<Carte>>();
    public ArrayList<ArrayList<Carte>> deuxiemeEquipe = new ArrayList<ArrayList<Carte>>();


    /* on cree une liste qui copie la liste des joueurs*/
    /*qui changera en fonction des tours*/
    public ArrayList<ArrayList<Carte>> joueurstour = new ArrayList<ArrayList<Carte>>();
    public ArrayList<Carte> plateau = new ArrayList<Carte>();
    public Scanner saisieUtilisateur = new Scanner(System.in);

    public Carte asCo = new Carte("rouge","coeur","as",11,32);
    public Carte asCa = new Carte("rouge","carreaux","as",11,32);
    public Carte asP = new Carte ("noir","pique","as",11,32);
    public Carte asT = new Carte ("noir","trefle","as",11,32);
    public Carte roiCo = new Carte("rouge","coeur","roi",4,32);
    public Carte roiCa = new Carte("rouge","carreaux","roi",4,32);
    public Carte roiP = new Carte ("noir","pique","roi",4,32);
    public Carte roiT = new Carte ("noir","trefle","roi",4,32);
    public Carte dameCo = new Carte("rouge","coeur","dame",3,32);
    public Carte dameCa = new Carte("rouge","carreaux","dame",3,32);
    public Carte dameP = new Carte ("noir","pique","dame",3,32);
    public Carte dameT = new Carte ("noir","trefle","dame",3,32);
    public Carte valaisCo = new Carte("rouge","coeur","valais",2,32);
    public Carte valaisCa = new Carte("rouge","carreaux","valais",2,32);
    public Carte valaisP = new Carte ("noir","pique","valais",2,32);
    public Carte valaisT = new Carte ("noir","trefle","valais",2,32);
    public Carte dixCo = new Carte("rouge","coeur","dix",10,32);
    public Carte dixCa = new Carte("rouge","carreaux","dix",10,32);
    public Carte dixP = new Carte ("noir","pique","dix",10,32);
    public Carte dixT = new Carte ("noir","trefle","dix",10,32);
    public Carte neufCo = new Carte("rouge","coeur","neuf",0,32);
    public Carte neufCa = new Carte("rouge","carreaux","neuf",0,32);
    public Carte neufP = new Carte ("noir","pique","neuf",0,32);
    public Carte neufT = new Carte ("noir","trefle","neuf",0,32);
    public Carte huitCo = new Carte("rouge","coeur","huit",0,32);
    public Carte huitCa = new Carte("rouge","carreaux","huit",0,32);
    public Carte huitP = new Carte ("noir","pique","huit",0,32);
    public Carte huitT = new Carte ("noir","trefle","huit",0,32);
    public Carte septCo = new Carte("rouge","coeur","sept",0,32);
    public Carte septCa = new Carte("rouge","carreaux","sept",0,32);
    public Carte septP = new Carte ("noir","pique","sept",0,32);
    public Carte septT = new Carte ("noir","trefle","sept",0,32);

    public String atout = "rien";


    public void jeuJeu(){
        /*deroulement du jeu*/
        System.out.println("d????but du jeu");
        Jeu action = new Jeu() ;
        action.preparerjeu(this);

        System.out.println("equipe la taille du paquet est : "+action.paquetCarte.size());
        System.out.println("le jeu est prepar????");

        action.preparerEquipeJeu(this);
        System.out.println("les equipes sont prepar????es");
        System.out.println("1 la taille du paquet est : "+action.paquetCarte.size());
        action.distribuerIerTourJeu(this);
        System.out.println("1 la taille du paquet est : "+action.paquetCarte.size());
        System.out.println("les cartes sont distribu????es");
        action.atoutChoixJeu(this);

    }

    public void preparerjeu( Jeu jeu){
        /* met les cartes dans le paquet et le melange */



        this.paquetCarte.add(asCo);
        this.paquetCarte.add(asCa);
        this.paquetCarte.add(asP);
        this.paquetCarte.add(asT);

        this.paquetCarte.add(roiCo);
        this.paquetCarte.add(roiCa);
        this.paquetCarte.add(roiP);
        this.paquetCarte.add(roiT);

        this.paquetCarte.add(dameCo);
        this.paquetCarte.add(dameCa);
        this.paquetCarte.add(dameP);
        this.paquetCarte.add(dameT);

        this.paquetCarte.add(valaisCo);
        this.paquetCarte.add(valaisCa);
        this.paquetCarte.add(valaisP);
        this.paquetCarte.add(valaisT);

        this.paquetCarte.add(dixCo);
        this.paquetCarte.add(dixCa);
        this.paquetCarte.add(dixP);
        this.paquetCarte.add(dixT);

        this.paquetCarte.add(neufCo);
        this.paquetCarte.add(neufCa);
        this.paquetCarte.add(neufP);
        this.paquetCarte.add(neufT);

        this.paquetCarte.add(huitCo);
        this.paquetCarte.add(huitCa);
        this.paquetCarte.add(huitP);
        this.paquetCarte.add(huitT);

        this.paquetCarte.add(septCo);
        this.paquetCarte.add(septCa);
        this.paquetCarte.add(septP);
        this.paquetCarte.add(septT);

        Collections.shuffle(this.paquetCarte);
        System.out.println("preparer la taille du paquet est : "+this.paquetCarte.size());


    }

    public void preparerEquipeJeu(Jeu jeu){
        premiereEquipe.add(joueur1);
        premiereEquipe.add(joueur3);
        deuxiemeEquipe.add(joueur2);
        deuxiemeEquipe.add(joueur4);
        // System.out.println("la taille joueurs"+joueurs.size());
        joueurs.add(joueur1);
        joueurs.add(joueur3);
        joueurs.add(joueur2);
        joueurs.add(joueur4);
        // System.out.println("la taille joueurs"+joueurs.size());
        joueurstour=joueurs;
        // System.out.println("la taille joueurs"+joueurs.size());

    }

    public void distribuerCarte(ArrayList<Carte> joueur, int nb, Jeu jeu){
        /* donne un nombre nb de carte au joueur joueur */
        //System.out.println("je donne : " + nb+" carte");
        for(int i=0; i<nb ; i++){
            //System.out.println("tiens une carte");
            //System.out.println(i);

            System.out.println("taille paquet :"+this.paquetCarte);
            joueur.add(paquetCarte.get(0));
            paquetCarte.remove(paquetCarte.get(0));
            System.out.println(paquetCarte.size());
        }
    }

    public void distribuerIerTourJeu(Jeu jeu){
        /*distribue les cartes du premier tour donc 3 cartes puis 2 cartes*/


        // System.out.println(" je distribue 3 cartes ");
        // System.out.println("la taille joueurs"+joueurs.size());
        // System.out.println("la taille joueurs 1"+joueur1.size());
        // System.out.println("la taille joeurs tour "+joueurstour.size());
        // System.out.println("la taille equiupe"+premiereEquipe.size());
        // for(ArrayList<Carte> joueur : joueurs){
        //     System.out.println(joueur);
        // }
        System.out.println("je donne les cartes premier tour");
        int compteur=0;

        for(ArrayList<Carte> joueur : joueurs){
            // System.out.println(" tiens 3 cartes ");
            compteur=compteur+1;
            this.distribuerCarte(joueur, 3,this);
        }
        System.out.println(compteur);

        for(ArrayList<Carte> joueur : joueurs){
            // System.out.println(" je distribue 2 cartes ");
            this.distribuerCarte(joueur, 2, this);
        }
        // for(ArrayList<Carte> joueur : joueurs){
        //     for(Carte carte : joueur){
        //         System.out.println(carte.toString());

        //     }
        //     System.out.println("--------");
        //}



    }
    public void atoutChoixJeu(Jeu jeu){
        /* montre les cartes au joueur et la carte au centre, leur demande si il veulent prendre */
        /*si ils prennent, donne la carte et donne les cartes manquantes aux joueurs */
        System.out.println("la taille du paquet est : "+paquetCarte.size());


        String str= "pas encore" ;
        System.out.println("la taille du paquet est : "+paquetCarte.size());
        System.out.println("l atout est");
        boolean bouclestop = true;
        for(int tour=0;tour<2; tour++) {
            for(ArrayList<Carte> joueurss : joueurs){
                while (!str.equals("oui")&&!str.equals("non")&&bouclestop){
                    System.out.println(paquetCarte.get(0).toString());
                    System.out.println("------------");
                    System.out.println("tu a : ");
                    this.montrerCarteJeu(joueurss);
                    System.out.println("voulez vous prendre ?");
                    System.out.println(str);
                    System.out.println(atout);
                    str= saisieUtilisateur.next();
                    System.out.println(str);System.out.println(str);
                    if(str.equals("oui")){
                        bouclestop= false;
                        System.out.println("je donne la carte du milieu");
                        System.out.println("la taille du paquet est : "+paquetCarte.size());
                        this.distribuerCarte(joueurss, 1, this);
                        System.out.println("je donne les autres cartes");
                        this.distribuerdemeTour();
                    }
                    if(tour==0) {
                        atout = paquetCarte.get(0).getMotif();
                    }
                    if(tour==1&&str.equals("oui")) {
                        atout = saisieUtilisateur.next();
                    }
                }
                str="rien";
                System.out.println("premier joueur");
            }

        }
    }
    public void distribuerdemeTour(){
        /*distribue les cartes pour que tout les joueurs aient 8 cartes */
        Jeu t = new Jeu() ;
        for(ArrayList<Carte> joueur : joueurs){
            t.distribuerCarte(joueur, 8-joueur.size(), this);
        }
    }
    public void tourJeu() {
        /* deroulement d'un tour */
        /* in progress */
        Jeu t = new Jeu();
        t.premierjoueurJeu(joueurstour.get(0));
        for(int i = 1 ; i<4;i++){
            t.autresjoueurJeu(joueurstour.get(i));
        }
    }


    public void montrerCarteJeu(ArrayList<Carte> joueur) {
        /*montre au joueur ces cartes */
        System.out.println("tu a : ");
        for(Carte i: joueur ){
            System.out.println(i.toString());  }
    }
    public void premierjoueurJeu(ArrayList<Carte> joueur){
        /*le premier joueur choisit la carte au centre */
        Jeu t =new Jeu();
        t.montrerCarteJeu(joueur);
        System.out.println("que veux tu jouer ?");
        int str= saisieUtilisateur.nextInt();
        plateau.add(joueur.get(str));
        joueur.remove(plateau.get(0));

    }
    public void autresjoueurJeu(ArrayList<Carte> joueur){
        /*les autres joueurs choisissent leur cartes et la methode verifie qu'ils aient le droit de jouer cette carte*/
        Jeu t =new Jeu();
        t.montrerCarteJeu(plateau);
        System.out.println("voici tes cartes");
        t.montrerCarteJeu(joueur);
        boolean bouclestop = true;

        int str= saisieUtilisateur.nextInt();

        if (!plateau.get(0).getMotif().equals(joueur.get(str).getMotif())){
            for (int i=0 ; i<joueur.size() && bouclestop ; i++ ){
                if (joueur.get(i).getMotif().equals(plateau.get(0).getMotif()) ){
                    System.out.println("tu ne peut pas jouer ca ");
                    bouclestop = false;

                }
            }
            if(bouclestop&&joueur.get(str).getMotif().equals(atout)){
                /* to do */
                /* gerer si c'est bien une carte atout */
                /*si oui regarder si il ne dois pas jouer au dessus d un autres atout */

            }
            if(bouclestop){
                for (int i=0 ; i<joueur.size() && bouclestop ; i++ ){
                    /* si tu as un atout tu ne peux pas pisser */
                    /* sauf si c'est le joueur de ton equipe qui gagne */
                    if (joueur.get(i).getMotif().equals(atout) ){
                        System.out.println("tu ne peut pas jouer ca ");
                        bouclestop = false;
                    }
                }
            }
        }
    }

    public void atoutPointJeu(){
        Jeu x = new Jeu();
        for(Carte carte : paquetCarte){
            x.pointParAtoutJeu(carte);
        }
        for(ArrayList<Carte> joueurss : joueurs){
            for(Carte carte : joueurss){
                x.pointParAtoutJeu(carte);
            }
        }

    }
    public void pointParAtoutJeu(Carte carte){
        if (carte.getMotif().equals(atout)){
            if (carte.getNb().equals("valais")){
                carte.setPoint(20);

            }
            if (carte.getNb().equals("neuf")){
                carte.setPoint(14);

            }
        }   }

}

