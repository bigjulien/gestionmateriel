package materiel;

import logiciel.Android;
import logiciel.Ios;
import logiciel.Os;

public class Tablette extends Materiel {

	// Rajouter paramètre
	public Tablette(Os os) {
		//initialiseItem();
		this.nom = "tablette";
		this.os = os;
	}

	public String getName() {
		return this.nom;
	}

	public String toString() {
		return this.getName();
	}

}
