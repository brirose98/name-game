package elements;

import java.util.*;
import elements.Name;
import elements.Bowl;
import java.util.Random;
public class Player {
    boolean nameGuessed = false;
    Name name;
    int slaves = 0;
    int id;

    Player(Name name){
        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
        this.id = rand_int;
        this.name = name;
        this.nameGuessed = false;
        this.slaves = 0;
    }
    public Name name(){
        return this.name;
    }

    public boolean nameGuessed(){
        return this.nameGuessed;
    }

    public int slaves(){
        return this.slaves;
    }

    public boolean guessPlayerName(Player player, Name name) {
        return  Bowl.guessName(this, player, name);
    }


}
