import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Initialisation {
    public Terminal term;

    public Initialisation() {
        this.term = null;
        DefaultTerminalFactory default_term = new DefaultTerminalFactory();
        try {
            term = default_term.createTerminal();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (term != null) {
                try {
                    term.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
