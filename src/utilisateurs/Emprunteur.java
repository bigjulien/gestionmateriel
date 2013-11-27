/**
* @author Julien
* Cette classe permet de créer un emprunteur.
*/
package utilisateurs;

public abstract class Emprunteur extends Utilisateur  {
		Materiel m=null;
		Emprunteur(String name)
		{
			super(name);
		}
		
		abstract int emprunter();
		abstract int askGestionnaire();
		
}

