import com.googlecode.lanterna.TerminalPosition;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Initialisation init = new Initialisation();
        try{
            init.term.putString("Hello World !");
            init.term.flush(); // update terminal print

            TerminalPosition startPosition = init.term.getCursorPosition();
            init.term.setCursorPosition(startPosition.withRelativeColumn(3).withRelativeRow(2));
            init.term.flush();

            /*
            init.term.setBackgroundColor(TextColor.ANSI.BLUE);
            init.term.setForegroundColor(TextColor.ANSI.YELLOW);*/
            Thread.sleep(2000);
            init.term.bell();
            init.term.flush();
            Thread.sleep(200);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
