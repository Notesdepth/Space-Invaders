import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.io.IOException;
import java.util.*;

public class Menu extends Initialisation {
    public String title; // titre décoratif avec le nom du jeu
    public List<String> menu = new ArrayList<String>(); //liste des menus


    public Menu(){
        super();
        this.title = "SPACE INVADERS";
        this.menu.add("Jouer");
        this.menu.add("Options");
        this.menu.add("Quitter");
    }

    public void printMenu(){
        this.textGraphics.putString(2,1, title, SGR.BOLD);
        try {
            this.term.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
