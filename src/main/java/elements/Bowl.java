package elements;
import elements.Name.*;
import elements.Player.*;
import java.util.Random;
import elements.Game;
import java.util.*;

public class Bowl {
    ArrayList<Name> namesInBowl;
    ArrayList<Player> players;

    Bowl(){
        this.namesInBowl = new ArrayList<Name>();
        this.players = new ArrayList<Player>();
    }

    public void add(Name name){
        this.namesInBowl.add(this.players.size(), name);

    }

    public int howManyNames(){
        return this.namesInBowl.size();
    }

    public Name drawName(){
        Random rand = new Random();
        int rand_int = rand.nextInt(namesInBowl.size());
        return namesInBowl.get(rand_int);

    }
}
