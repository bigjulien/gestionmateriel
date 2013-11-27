package materiel;

public class Casque extends Materiel {

	public Casque(){
		this.nom="casque";
	}
	
	public String getName(){
		return this.nom;
	}
	public String toString(){
		return this.getName();
	}
}
