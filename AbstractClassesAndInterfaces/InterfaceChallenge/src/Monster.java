import java.util.List;
import java.util.ArrayList;

public class Monster implements ISaveable {
    
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return this.name;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }


    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", hitPoints='" + getHitPoints() + "'" + ", strength='"
                + getStrength() + "'" + "}";
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);// one way of converting something to string
        values.add(2, "" + this.strength);

        return values;
    }

    // the parameter being sent over as input is an ArrayList
    // but the code will still work as it is a form of List
    // an advantage of using Interfaces
    @Override
    public void read(List<String> values) {
        if (values != null && values.size() > 0) {
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
        }
    }
}
