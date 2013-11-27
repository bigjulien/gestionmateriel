/**
* @author Julien
* Cette classe permet de créer un ensignant.
*/
package utilisateurs;

public class Enseignant extends Etudiant{
	int nbDayReservation;
	Enseignant(String name, String password) {
		super(name, password);
		// TODO Auto-generated constructor stub
	}
	
	public int reserver(int nbDay) {
		nbDayReservation = nbDay;
		return 0;
	}

	

}
