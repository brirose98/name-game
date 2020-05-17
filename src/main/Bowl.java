package main;
import main.Name.*;
import main.Player.*;
import java.util.Random;
import main.Game;
import java.util.*;

    public class Bowl {
        ArrayList<Name> namesInBowl = new ArrayList<Name>();
        ArrayList<Player> players = new ArrayList<Player>();

       public void add(Name name){
           this.namesInBowl.add(name);
       }

       public boolean guessName(Player guesser, Player target, Name name){
           if(target.name.equals(name)){
               target.nameGuessed = true;
               guesser.slaves += 1;
               if (guesser.slaves == this.namesInBowl.size()){
                   Game.winGame(guesser);
               }
               return true;
           }
           return false;
       }

       public Name drawName(){
           Random rand = new Random();
           int rand_int = rand.nextInt(namesInBowl.size());
           return namesInBowl.get(rand_int);

       }
}
