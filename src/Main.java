import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        DefaultTerminalFactory defaultTerm = new DefaultTerminalFactory(); //terminal avec valeurs par défaut

        Terminal ter = null;
        try{
            ter = defaultTerm.createTerminal();

            ter.putCharacter('H');
            ter.putCharacter('e');
            ter.putCharacter('l');
            ter.putCharacter('l');
            ter.putCharacter('o');
            ter.putCharacter(' ');
            ter.putCharacter('W');
            ter.putCharacter('o');
            ter.putCharacter('r');
            ter.putCharacter('l');
            ter.putCharacter('d');
            ter.putCharacter('!');
            ter.flush(); // update terminal print

            TerminalPosition startPosition = ter.getCursorPosition();
            ter.setCursorPosition(startPosition.withRelativeColumn(3).withRelativeRow(2));
            ter.flush();

            /*
            ter.setBackgroundColor(TextColor.ANSI.BLUE);
            ter.setForegroundColor(TextColor.ANSI.YELLOW);*/
            Thread.sleep(2000);
            ter.bell();
            ter.flush();
            Thread.sleep(200);
        }
        catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (ter != null)
            {
                try{
                    ter.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
