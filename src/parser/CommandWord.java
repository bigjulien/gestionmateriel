package parser;

/**
 * Representations for all the valid command words for the game along with a
 * string in a particular language.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2011.08.10
 */
public enum CommandWord {
    // A value for each command word along with its
    // corresponding user interface string.
    USER("user"),  LOGOUT("logout"), HELP("help"), REQ("req"), QUIT("quit"), SHOWMATERIEL("showmateriel"), SHOWREQ("showreq"), DATE("date"), SETDATE("setdate"), UNKNOWN("?") ;

    // The command string.
    private String commandString;

    /**
     * Initialise with the corresponding command string.
     * 
     * @param commandString
     *            The command string.
     */
    CommandWord(String commandString) {
        this.commandString = commandString;
    }

    /**
     * @return The command word as a string.
     */
    public String toString() {
        return commandString;
    }
}
