public class Potion extends Item {
    private String effect;

    public Potion(String name, String description, String effect) {
        super(name, description);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    public void consume() {
        System.out.println("Consuming " + getName() + " for " + effect + "!");
    }
}
