package requete;
import intervalle.Intervalle;
import materiel.Materiel;
import utilisateurs.Utilisateur;

public class Requete {

	private Utilisateur user;
	private Materiel item;
	private Intervalle intervalle;

	
	public Requete(Utilisateur user, Materiel item, Intervalle intervalle){
		this.user=user;
		this.item=item;
		this.intervalle=intervalle;
	}
	

	public String toString(){
		return user.toString()+ " souhaite réserver l'objet "+item.toString()+" "+intervalle.toString();
	}
	
	
}
