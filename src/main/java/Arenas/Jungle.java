package Arenas;

import arsenal.IAttack;
import characters.enemies.Enemy;
import characters.extras.Extra;
import characters.players.Player;

public class Jungle {

    private IAttack player;
    private IAttack enemy;
    private Extra extra;

    public Jungle(IAttack player, IAttack enemy, Extra extra){
        this.player = player;
        this.enemy = enemy;
        this.extra = extra;
    }

    public IAttack getPlayer() {
        return player;
    }

    public IAttack getEnemy() {
        return enemy;
    }

    public Extra getExtra() {
        return extra;
    }

}
