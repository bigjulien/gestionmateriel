/**
* @author Julien
* Cette classe permet de créer un utilisateur
*/

package utilisateurs;

public abstract class Utilisateur
{
	private String name;
	private boolean islogged=false;
	
	Utilisateur(String name)
	{
		this.name =name;		
	}
}
