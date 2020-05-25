package elements;
import elements.Player;
import elements.Bowl;
import elements.Name;
import java.util.Dictionary;

public class Game {
    Bowl bowl;
    Player[] players;
    Dictionary<Player, Name> names;

    public static String winGame(Player player){
        System.out.println(String.format("%s has won the Game! Bow before your Ruler, Emperor %s", player, player.name));
        return endGame();
    }

    public static String endGame(){
        System.out.println("The Game is now over.");
        return "Goodbye!";

    }
}