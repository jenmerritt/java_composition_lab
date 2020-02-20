package Arenas;

import characters.enemies.Enemy;
import characters.extras.Extra;
import characters.players.Player;

public class Jungle {

    private Player player;
    private Enemy enemy;
    private Extra extra;

    public Jungle(Player player, Enemy enemy, Extra extra){
        this.player = player;
        this.enemy = enemy;
        this.extra = extra;
    }

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public Extra getExtra() {
        return extra;
    }

}
