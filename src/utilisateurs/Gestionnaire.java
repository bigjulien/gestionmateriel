/**
* @author Julien
* Cette classe permet de créer un gestionnaire.
*/
package utilisateurs;

import materiel.Materiel;
public class Gestionnaire extends Utilisateur{

	public Gestionnaire(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
	}
	int valider(Emprunteur e,Materiel m)
	{
		System.out.println("Je valide");
		return 1;
	}
}
