package elements;
import elements.Player;
import elements.Bowl;
import elements.Name;
import java.util.Dictionary;
import java.util.Hashtable;

public class Game {
    Bowl bowl;
    int players = 0;
    Dictionary<Integer, Name> names;

    Game(){
        this.bowl = new Bowl();
        this.names = new Hashtable<Integer,Name>();
    }
    public void addPlayer(Player player){
        this.names.put(player.id, player.name);
        this.bowl.add(player.name);
        this.players ++;
    }
    public Name getPlayerName(Player player){
       return names.get(player.id);
    }
    public boolean guessName( Player target, Name name) {
        Name correctName = this.getPlayerName(target);
        if (correctName.equals(name)) {
            target.nameGuessed = true;
            return true;
        } else {
            return false;
        }
    }
    public static void winGame(Player player){
       System.out.format("The Game has been won! Bow before your Ruler, Emperor %s!", player.name());

    }

}