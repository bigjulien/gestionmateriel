package materiel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import logiciel.Os;
import logiciel.Android;
import logiciel.Ios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Materiel {

	//private List<Materiel> list = new ArrayList();
	private HashMap<List<Materiel>, String> materiel;
	protected String nom;
	protected Os os;
	protected SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	public Date date;
	// http://www.mkyong.com/java/how-to-compare-dates-in-java/
	// Pour initialiser "d" au 31 janvier 2013: d = sdf.parse("31-12-2013");
	

	//Initialise une HashMap avec le materiel
	public void initialiseStock(int nbTabAndroid, int nbTabIos, int nbTelAndroid, int nbTelIos, int nbCasque, int nbCamera) {
		materiel.put(initialiseMateriel("tablette", "Android", nbTabAndroid),"tabletteAndroid");
		materiel.put(initialiseMateriel("tablette", "Ios", nbTabAndroid),"tabletteIos");
		materiel.put(initialiseMateriel("telephone", "Android", nbTabAndroid),"telephoneAndroid");
		materiel.put(initialiseMateriel("telephone", "Ios", nbTabAndroid),"telephoneIos");
		materiel.put(initialiseMateriel("camera","", nbTabAndroid),"camera");
		materiel.put(initialiseMateriel("casque","", nbTabAndroid),"casque");
	}
	
	//Commun à tout item à initialiser
	public void initialiseItem(){
		this.date=null;
	}
	
	//Initialise un type d'objet de Materiel
	public List<Materiel> initialiseMateriel(String name, String Os, int nbItem){
		List<Materiel> list = new ArrayList<Materiel>();
		switch (name){
			case "tablette" :
				if(Os.equals("Android")){
					for (int i=0;i<nbItem;i++){
						list.add(new Tablette(new Android()));
					};break;
				}else if(Os.equals("Ios")){
					for (int i=0;i<nbItem;i++){
						list.add(new Tablette(new Ios()));
					};break;
				}
			case "casque" :
				for (int i=0;i<nbItem;i++){
					list.add(new Casque());
				};break;
			case "telephone" :
				if(Os.equals("Android")){
					for (int i=0;i<nbItem;i++){
						list.add(new Telephone(new Android()));
					};break;
				}else if(Os.equals("Ios")){
					for (int i=0;i<nbItem;i++){
						list.add(new Telephone(new Ios()));
					};break;
				}
			case "camera" :
				for (int i=0;i<nbItem;i++){
					list.add(new Camera());
				};break;
			}
		return list;
	}
	//Initialise la date associée à un objet
	public void initialiseDate(String date) { 

		try{
			this.date=sdf.parse(date);
		}catch(ParseException ex){
    		ex.printStackTrace();
    	}
	}
	
	public Date getDate(){
		return this.date;
	}
	

}
