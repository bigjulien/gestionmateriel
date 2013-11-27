/**
* @author Julien
* Cette classe permet de créer un ensignant.
*/
package utilisateurs;

public class Enseignant extends Emprunteur{
	int nbDayReservation;
	public Enseignant(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public int reserver(int nbDay) {
		nbDayReservation = nbDay;
		return 0;
	}

	@Override
	int emprunter() {
	    // TODO Auto-generated method stub
	    return 0;
	}

	@Override
	int askGestionnaire() {
	    // TODO Auto-generated method stub
	    return 0;
	}

	

}
