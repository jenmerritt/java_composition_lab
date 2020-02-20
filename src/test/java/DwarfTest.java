import characters.players.Dwarf;
import characters.players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Jenkins", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Jenkins", dwarf.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void weaponsStartsAtZero(){
        assertEquals(0, dwarf.getNumberOfWeapons());
    }

}
