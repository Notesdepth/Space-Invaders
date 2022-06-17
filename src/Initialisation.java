import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Initialisation {
    public Terminal term;
    public TextGraphics textGraphics; //layout pour afficher des choses plus facilement sur le terminal
    public TerminalSize terminalSize = new TerminalSize(1440, 900); //permet de définir la taille du terminal

    public Initialisation() {
        this.term = null;
        DefaultTerminalFactory default_term = new DefaultTerminalFactory();
        default_term.setInitialTerminalSize(terminalSize); //LA LIGNE QUI FAIT LE JAVA HEAP SPACE
        try {
            term = default_term.createTerminal();
            term.setCursorVisible(false); //enlève le curseur
            textGraphics = term.newTextGraphics();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
