package main;
import java.util.*;

public class Name {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int length(){
        return name.length();
    }

    public char getLetter(int i){
        return name.charAt(i);
    }

    public char[] getLetters(){return name.toCharArray();}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }


}

