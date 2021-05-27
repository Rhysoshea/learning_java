import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable {
    

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;


    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", hitPoints='" + getHitPoints() + "'" +
            ", strength='" + getStrength() + "'" +
            ", weapon='" + getWeapon() + "'" +
            "}";
    }
    
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);// one way of converting something to string
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);

        return values;
    }

    // the parameter being sent over as input is an ArrayList
    // but the code will still work as it is a form of List
    // an advantage of using Interfaces
    @Override
    public void read(List<String> values) {
        if(values != null && values.size() >0){
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weapon = values.get(3);
        }
    }
}
