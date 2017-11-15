import homework4.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HorseRaceTest {
    Horse winner = new Horse("Fastest", 2, 10);
    Horse notWinner = new Horse("NotSoFast", 3, 5);
    ArrayList<Horse> horses = new ArrayList<>();
    HorseRace horseRace = new HorseRace(horses);

    @Before
    public void startTest() {
        horses.add(winner);
        horses.add(notWinner);
    }

    @Test
    public void checkBetWithWinnerTest() {
        Account account = new Account(250);
        Bet bet = new Bet(100, winner);
        assertTrue(horseRace.checkBet(bet, winner, account));
    }

    @Test
    public void checkBetWithWrongHorseTest() {
        Account account = new Account(250);
        Bet bet = new Bet(100, notWinner);
        assertFalse(horseRace.checkBet(bet, winner, account));
    }

    @Test
    public void getHorseRaceResultTest() {
        assertEquals(winner, horseRace.getHorseRaceResult(horses));
    }
}
