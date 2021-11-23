package belotte;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JeuTest jeu = new JeuTest();
		
		jeu.prepareJeu();
		jeu.afficherJeu();
		
		jeu.ajouterCarteJoueur();
		jeu.afficherMain();
	}

}
