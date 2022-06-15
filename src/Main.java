import com.googlecode.lanterna.TerminalPosition;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Initialisation init = new Initialisation();
        Menu menu = new Menu();
        try{
            menu.term.putString("Hello World !");
            menu.term.flush(); // update terminal print

            TerminalPosition startPosition = menu.term.getCursorPosition();
            menu.term.setCursorPosition(startPosition.withRelativeColumn(3).withRelativeRow(2));
            menu.printMenu();
            menu.term.flush();


            //menu.term.setBackgroundColor(TextColor.ANSI.BLUE);
            //menu.term.setForegroundColor(TextColor.ANSI.YELLOW);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                menu.term.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
