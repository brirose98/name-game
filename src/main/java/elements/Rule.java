package elements;

import java.util.*;
import elements.Name;
import elements.Bowl;
import elements.Player;

public class Rule {
    String badLetters= "1234567890-_+=~`,./<>?:;[{]}|   \n";
    boolean passedAll = false;


    public boolean checkIllegalChars(Name name){
        for(int i = 0; i<name.length(); i++){
            char[] nameLetters = name.getLetters();
            if (badLetters.indexOf(nameLetters[i]) != -1){
                System.out.println( "uhOh your Name has an illegal character!");
            }
            else {
                return true;

            }
        }
        return false;
    }

    public boolean checkNumWords(Name name){
        int count = 0;
        char[] nameLetters = name.getLetters();
        for(int i =0; i<name.length(); i++){
            if(nameLetters[i] == ' ') {
                count++;
            }
        }
        if(count > 4){
            System.out.println("uhOn your name can only be 5 words long!");
        }
        else{
            return true;
        }
        return false;
    }
    public boolean checkAllRules(Name name){
        if(checkNumWords(name) && checkIllegalChars(name)){
            passedAll = true;
        }
        return passedAll;
    }
}
