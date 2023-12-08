import java.util.Scanner;

    //  [1] Interface for RPG characters
interface RPGCharacter {
    void attacked();
    void run();

    void useBuff();
    void calculateDistance();

    int getHP();
    String getName();
    int getPosition();

}

    //  [2]  Interface for accessories
interface Accessory {
    void applyEffect(RPGCharacter character);
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RPGCharacter p = new Police("Officer Smith", 100, 10, 15, 0);
        RPGCharacter t = new Thief("Sneaky Pete", 80, 15, 20, 10);

        // 1st decision : character
        System.out.println("Choose character: P for Police, T for Thief");
        String choice = scanner.nextLine();
        RPGCharacter selectedCharacter = (choice.equalsIgnoreCase("P")) ? p : t;

        Accessory weapon = new Weapon("Gun");
        Accessory vehicle = new Vehicle("Scooter");
        Accessory dopeDrink = new DopeDrink("M150");

        // 2nd decision : accessory
        System.out.println("Choose accessory: W for Weapon, V for Vehicle, D for Dope Drink");
        choice = scanner.nextLine();
        Accessory selectedAccessory = switch (choice.toUpperCase()) {
            case "W" -> weapon;
            case "V" -> vehicle;
            case "D" -> dopeDrink;
            default -> null;
        };

        if (selectedAccessory != null) {
            selectedAccessory.applyEffect(selectedCharacter);
        }

        System.out.println("***************************");

        System.out.println("You wins!");

    }



}

