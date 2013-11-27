package simulation;

import java.util.*;

import parser.*;
import logiciel.*;
import materiel.*;
import utilisateurs.*;



public class Simulation {
    List<Utilisateur> listeus = new ArrayList<Utilisateur>();
    List<Materiel> listemat = new ArrayList<Materiel>();
    Parser parser;
    boolean wantToQuit = false;
    
    public Simulation()
    {
	createUsersBase();
	createMatosBase();
	parser = new Parser();
    }
    
    private void createUsersBase()
    {
	listeus.add(new Gestionnaire("Louis"));
	listeus.add(new Gestionnaire("Julien"));
	listeus.add(new Etudiant("Anna"));
	listeus.add(new Etudiant("Benjamin"));
	listeus.add(new Etudiant("Bella"));
	listeus.add(new Enseignant("Mechant"));	
    }
    
    private void createMatosBase()
    {
	listemat.add(new Tablette(new Android()));
	listemat.add(new Tablette(new Ios()));
	listemat.add(new Telephone(new Android()));
	listemat.add(new Telephone(new Ios()));
	listemat.add(new Casque());
	listemat.add(new Casque());
    }
    
    /**
     * La boucle principale de l'applet
     */
    public void demarre()
    {
	printWelcome();
        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Merci d'avoir utilisé notre application ! A bientôt !");
    }
    
    /** 
     * @param command
     * La commande a traiter
     * @return true si la commande est de quitter le jeu, false autrement. */
    
    private boolean processCommand(Command command) {
        boolean wantToQuit = false;

        CommandWord commandWord = command.getCommandWord();

        switch (commandWord) {
        case UNKNOWN:
            System.out.println("Commande non reconnue");
            break;
            
        case SHOWMATERIEL:
            System.out.println(listemat.toString());
            break;
        
        case QUIT:
            wantToQuit = quit();
            break;    
            
        case HELP:
            printHelp();
            break;
        /*
        case USER:
            login(command);
            break;
            
        case LOGOUT:
            logout(command);
            break;
            
        case REQ:
            requeteMateriel(command);
            break;
            
        case SHOWREQ:
            showReq(command);
            break;
        
        case DATE:
            returndate();
            break;
            
        case SETDATE:
            setDate(commande);
            break;
            */
        }
        
        return wantToQuit;
      
    }
    
    /**
     * Message d'ouverture.
     */
    private void printWelcome() {
        System.out.println();
        System.out.println("Bienvenue dans l'application gestionMateriel");
        System.out
                .println("");
        System.out.println("Pour commencer, loggue toi avec la commande user X");
        System.out.println("Tapez '" + CommandWord.HELP + "' si vous avez besoin d'aide");
        System.out.println();
    }
    
    /**
     * Message d'aide.
     */
    private void printHelp() {
        System.out.println("Coucou me revoila");
        System.out.println("Pour te donner une aide très utile");
        
        System.out.println();
        System.out.println("Tu peux taper les commandes suivantes : ");
        parser.showCommands();
    }
    
    private boolean quit()
    {
	
	System.out.println("Attention ! L'état de l'application ne sera pas sauvegardée ! Voulez vous réelement quitter (Y/N) ? ");
	Scanner reader = new Scanner(System.in);
	String a=reader.next();
	if(a.equals("Y"))
	{
	    return true;
	}
	return false;
	
    }
    
    
}
