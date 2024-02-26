public class Player {
    private String name;
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        inventory = new Inventory();
    }

    public void addItemToInventory(Item item) {
        inventory.addItem(item);
    }

    public void displayInventory() {
        inventory.displayInventory();
    }
}
