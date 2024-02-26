public class Inventory {
    private Item[] items;
    private int size;
    private static final int MAX_CAPACITY = 10;

    public Inventory() {
        items = new Item[MAX_CAPACITY];
        size = 0;
    }

    public void addItem(Item item) {
        if (size < MAX_CAPACITY) {
            items[size++] = item;
        } else {
            System.out.println("Inventory is full!");
        }
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (int i = 0; i < size; i++) {
            System.out.println(items[i].getName() + " - " + items[i].getDescription());
        }
    }
}
