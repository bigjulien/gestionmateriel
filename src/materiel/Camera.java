package materiel;

public class Camera extends Materiel {

	public Camera() {
		this.nom = "camera";
	}

	public String getName() {
		return this.nom;
	}

	public String toString() {
		return this.getName();
	}
}
