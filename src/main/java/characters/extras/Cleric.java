package characters.extras;

import arsenal.IAttack;
import arsenal.IHeal;
import arsenal.Remedy;

import java.util.ArrayList;

public class Cleric extends Extra implements IHeal {

    private ArrayList<Remedy> remedies;

    public Cleric(String name, int health){
        super(name, health);
        this.remedies = new ArrayList<Remedy>();
    }

    public ArrayList<Remedy> getRemedies() {
        return remedies;
    }

    public int getNumberOfRemedies() {
        return remedies.size();
    }

    public void addRemedy(Remedy remedy){
        remedies.add(remedy);
    }

    public void heal(IAttack player){
        int increasedHealth = player.getHealth() + 20;
        player.setHealth(increasedHealth);
    }
}
