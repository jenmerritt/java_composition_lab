import Arenas.Jungle;
import arsenal.Weapon;
import characters.enemies.Enemy;
import characters.enemies.Troll;
import characters.extras.Cleric;
import characters.extras.Extra;
import characters.players.Dwarf;
import characters.players.Player;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArenaTest {

    Jungle jungle;
    Player dwarf;
    Enemy enemy;
    Extra extra;
    Weapon club;


    @Before
    public void before() {
        dwarf = new Dwarf("Jenkins", 100);
        club = new Weapon("club", 20);
        enemy = new Troll("Gurt", 100, 20, club);
        extra = new Cleric("Hoffman", 100);
        jungle = new Jungle(dwarf, enemy, extra );
    }

    @Test
    public void getPlayer() {
        assertEquals(dwarf, jungle.getPlayer());
    }

    @Test
    public void getEnemy() {
        assertEquals(enemy, jungle.getEnemy());
    }

    @Test
    public void getExtra() {
        assertEquals(extra, jungle.getExtra());
    }
}
