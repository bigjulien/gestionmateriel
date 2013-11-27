package materiel;

import logiciel.Os;

public class Telephone extends Materiel {
	
	public Telephone(Os os){
		this.nom="telephone";
		this.os=os;
	}
	
	public String getName(){
		return this.nom;
	}
	public String toString(){
		return this.getName();
	}

}
