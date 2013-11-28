package intervalle;

import java.text.SimpleDateFormat;

public class Intervalle {

	private SimpleDateFormat d1;
	private SimpleDateFormat d2;
	
	public Intervalle(SimpleDateFormat d1, SimpleDateFormat d2){
		this.d1=d1;
		this.d2=d2;
	}
	
	public String toString(){
		return "du "+d1.toString()+" au "+d2.toString();
	}
}
