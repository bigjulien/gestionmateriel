package simulation;

import java.util.ArrayList;
import java.util.List;

import logiciel.Android;
import logiciel.Ios;
import materiel.Casque;
import materiel.Materiel;
import materiel.Tablette;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Materiel m=new Tablette(new Android());
		Materiel mm=new Casque();
		m.initialiseDate("22-11-2013");
		System.out.println(m.getDate().toString());
		System.out.println(m.toString());
		
	}
					
		


}
