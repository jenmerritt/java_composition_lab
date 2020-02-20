package characters.players;

import arsenal.IAttack;

public abstract class Player{

    private String name;
    private int health;
    private int treasure;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
        this.treasure = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
