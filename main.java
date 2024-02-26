import java.util.Scanner;

public class main {
    private static Player player = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createPlayer();
                    break;
                case 2:
                    addWeapon();
                    break;
                case 3:
                    addArmor();
                    break;
                case 4:
                    addPotion();
                    break;
                case 5:
                    if (player != null) {
                        player.displayInventory();
                    } else {
                        System.out.println("Player not created yet!");
                    }
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.print("Enter your choice: \n");
        System.out.println("1) Create Player");
        System.out.println("2) Add Weapon");
        System.out.println("3) Add Armor");
        System.out.println("4) Add Potion");
        System.out.println("5) See Inventory");
        System.out.println("6) Exit");

    }

    private static void createPlayer() {
        System.out.print("Enter player name: ");
        String playerName = scanner.nextLine();
        player = new Player(playerName);
        System.out.println("Player " + playerName + " created successfully!");
    }

    private static void addWeapon() {
        if (player != null) {
            System.out.print("Enter weapon name: ");
            String name = scanner.nextLine();
            System.out.print("Enter weapon description: ");
            String description = scanner.nextLine();
            System.out.print("Enter weapon damage: ");
            int damage = scanner.nextInt();
            scanner.nextLine();
            Weapon weapon = new Weapon(name, description, damage);
            player.addItemToInventory(weapon);
            System.out.println("Weapon added to inventory.");
        } else {
            System.out.println("Player not created yet!");
        }
    }

    private static void addArmor() {
        if (player != null) {
            System.out.print("Enter armor name: ");
            String name = scanner.nextLine();
            System.out.print("Enter armor description: ");
            String description = scanner.nextLine();
            System.out.print("Enter armor defense: ");
            int defense = scanner.nextInt();
            scanner.nextLine();
            Armor armor = new Armor(name, description, defense);
            player.addItemToInventory(armor);
            System.out.println("Armor added to inventory.");
        } else {
            System.out.println("Player not created yet!");
        }
    }

    private static void addPotion() {
        if (player != null) {
            System.out.print("Enter potion name: ");
            String name = scanner.nextLine();
            System.out.print("Enter potion description: ");
            String description = scanner.nextLine();
            System.out.print("Enter potion effect: ");
            String effect = scanner.nextLine();
            Potion potion = new Potion(name, description, effect);
            player.addItemToInventory(potion);
            System.out.println("Potion added to inventory.");
        } else {
            System.out.println("Player not created yet!");
        }
    }
}
