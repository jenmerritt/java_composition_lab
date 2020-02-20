package characters.extras;

import arsenal.Remedy;

import java.util.ArrayList;

public class Cleric extends Extra {

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


}
