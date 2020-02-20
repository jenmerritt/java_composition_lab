package characters.enemies;

import arsenal.Weapon;

import java.util.ArrayList;

public class Troll extends Enemy {

    private int treasure;
    private Weapon club;

    public Troll(String name, int health, int treasure, Weapon club){
        super(name, health);
        this.treasure = treasure;
        this.club = club;

    }

    public int getTreasure() {
        return this.treasure;
    }
}
