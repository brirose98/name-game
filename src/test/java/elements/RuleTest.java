package elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleTest {

    @Test
    void checkIllegalChars() {
        Rule r = new Rule();
        Name name = new Name("Polly!");
        assertFalse(r.checkIllegalChars(name));
    }

    @Test
    void checkIllegalChars2() {
        Rule r = new Rule();
        Name name = new Name("Polly $!");
        assertFalse(r.checkIllegalChars(name));
    }

    @Test
    void checkIllegalChars3() {
        Rule r = new Rule();
        Name name = new Name("Polly");
        assertTrue(r.checkIllegalChars(name));
    }
    @Test
    void checkNumWords() {
        Rule r = new Rule();
        Name name = new Name("Billy Bob Joe Bob Joe");
        assertFalse(r.checkNumWords(name));
    }

    @Test
    void checkNumWords2() {
        Rule r = new Rule();
        Name name = new Name("Billy Bob Joe Bob");
        assertTrue(r.checkNumWords(name));
    }
    @Test
    void checkAllRules() {
        Rule r = new Rule();
        Name name = new Name("Billy Bob Joe Bob Joe");
        assertFalse(r.checkAllRules(name));
    }
    @Test
    void checkAllRules2() {
        Rule r = new Rule();
        Name name = new Name("Billy Bob Joe Bob Joe!");
        assertFalse(r.checkAllRules(name));
    }

    @Test
    void checkAllRules3() {
        Rule r = new Rule();
        Name name = new Name("Barbie##");
        assertFalse(r.checkAllRules(name));
    }

    @Test
    void checkAllRules4() {
        Rule r = new Rule();
        Name name = new Name("Barbie");
        assertTrue(r.checkAllRules(name));
    }
}