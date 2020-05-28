package elements;
import java.util.*;
import elements.Rule;

public class Name {
    String name;

   Name(String name) {
        this.name = name;
    }

    public int length(){
        return name.length();
    }

    public char getLetter(int i){
        return name.charAt(i);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

