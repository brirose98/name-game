package elements;

import java.util.Random;

public class Player {
    Game game;
    boolean nameGuessed = false;
    Name name;
    int slaves = 0;
    int id;

    Player(Game game, Name name){
        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
        this.id = rand_int;
        this.name = name;
        this.nameGuessed = false;
        this.slaves = 0;
        this.game = game;
    }
    public String name(){
        return this.name.name;
    }

    public boolean nameGuessed(){
        return this.nameGuessed;
    }

    public int slaves(){
        return this.slaves;
    }

    public boolean guessPlayerName(Player player, Name name) {
        boolean x  = this.game.guessName( player, name);
        if(x) {
            //boolean val from game
            this.slaves++;
            if (this.slaves == this.game.players) {
                Game.winGame(this);
            }
        }
        return x;
    }


}
