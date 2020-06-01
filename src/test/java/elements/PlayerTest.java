package elements;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testName() {
        Game game = new Game();
        Name name = new Name("sir blue demon");
        Player one = new Player(game, name);
        assertEquals(name.name, one.name());
    }

    @Test
    void testNameGuessed() {
        Player mockPlayer = mock(Player.class);
        when(mockPlayer.nameGuessed()).thenReturn(true);
        assertEquals(true, mockPlayer.nameGuessed());
    }

    @Test
    void testSlaves() {
        Player mockPlayer = mock(Player.class);
        when(mockPlayer.slaves()).thenReturn(1);
        assertEquals(1, mockPlayer.slaves());
    }

    @Test
    void testGuessPlayerName() {
        Player  mockPlayer = mock(Player.class);
        Player mockPlayer2 = mock(Player.class);
        Name name = new Name("St Vincent DePaul");
        when(mockPlayer.guessPlayerName(mockPlayer2, name)).thenReturn(true);

        assertEquals(true, mockPlayer.guessPlayerName(mockPlayer2,name));
    }
    @Test
    void testGuessPlayerName2() {
        Game game = new Game();
        Name name = new Name("St Vincent DePaul");
        Name name2 = new Name("Dibs");
        Name name3 = new Name("bowser");
        Player one = new Player(game, name);
        Player two = new Player(game, name2);
        game.addPlayer(one);
        game.addPlayer(two);
        assertEquals(false, two.guessPlayerName(one,name3));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/players.csv", numLinesToSkip = 1)
    void CreatePlayers(String name1, String name2){
        Game game = new Game();
        Name nameOne = new Name(name1);
        Name nameTwo = new Name(name2);
        Player playerOne = new Player(game, nameOne);
        Player playerTwo = new Player(game, nameTwo);
        game.addPlayer(playerOne);
        game.addPlayer((playerTwo));

        assertEquals(2, game.players);

    }

}