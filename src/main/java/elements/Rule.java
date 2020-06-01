package elements;

import java.util.*;
import elements.Name;
import elements.Bowl;
import elements.Player;

public class Rule {
    String badLetters= "#*&^%$@()1234567890-_+=~`,/<>?!:;[{]}|";
    boolean passedAll = false;


    public boolean checkIllegalChars(Name name){
        char[] nameLetters = new char[name.length()];
        for(int i = 0; i<name.length(); i++){
            nameLetters[i] = name.getLetter(i);
            if (badLetters.indexOf(nameLetters[i]) != -1){
             //   System.out.println( "uhOh your Name has an illegal character!");
                return false;
            }
            else {
                continue;            }
        }
        return true;
    }

    public boolean checkNumWords(Name name){
        int count = 0;
        char[] nameLetters = new char[name.length()];
        for(int i = 0; i<name.length(); i++) {
            nameLetters[i] = name.getLetter(i);
            if(nameLetters[i] == ' ') {
                count++;
            }
        }
        if(count > 4){
           // System.out.println("uhOn your name can only be 5 words long!");
            return false;
        }
        else{
            return true;
        }
    }
    public boolean checkAllRules(Name name){
        if(checkNumWords(name) && checkIllegalChars(name)){
            passedAll = true;
        }
        return passedAll;
    }
}
