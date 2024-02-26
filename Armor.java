public class Armor extends Item {
    private int defense;

    public Armor(String name, String description, int defense) {
        super(name, description);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void equip() {
        System.out.println("Equipping " + getName() + "!");
    }
}
