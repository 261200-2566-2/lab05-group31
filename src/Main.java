import java.util.Scanner;

// Interface for RPG characters
interface RPGCharacter {
    void attack();
    void run();
    void useBuff();
    void calculateDistance();

    int getHP();
    String getName();
    int getPosition();


}

// Interface for accessories
interface Accessory {
    void applyEffect(RPGCharacter character);
}

// Implementing character classes
class Police implements RPGCharacter {
    String name;
    int HP;
    int speed;
    int attack;
    int position;

    public int getHP(){
        return HP;
    }
    public int getPosition(){
        return position;
    }
    public String getName(){
        return name;
    }

    public Police(String name, int HP, int speed, int attack, int position) {
        this.name = name;
        this.HP = HP;
        this.speed = speed;
        this.attack = attack;
        this.position = position;
    }

    @Override
    public void attack() {
        // Implement attack logic for police
        System.out.println(name + " attacks!");
    }

    @Override
    public void run() {
        // Implement run logic for police
        System.out.println(name + " is running.");
    }

    @Override
    public void useBuff() {
        // Implement useBuff logic for police
        System.out.println(name + " uses a buff.");
    }

    @Override
    public void calculateDistance() {
        // Implement calculateDistance logic for police
        System.out.println(name + " calculates distance.");
    }
}

class Thief implements RPGCharacter {
    String name;
    int HP;
    int speed;
    int attack;
    int position;
    public int getHP(){
        return HP;
    }
    public int getPosition(){
        return position;
    }
    public String getName(){
        return name;
    }
    public Thief(String name, int HP, int speed, int attack, int position) {
        this.name = name;
        this.HP = HP;
        this.speed = speed;
        this.attack = attack;
        this.position = position;
    }

    @Override
    public void attack() {
        // Implement attack logic for thief
        HP -= 20;
        System.out.println(name + " attacks!");
    }

    @Override
    public void run() {
        position -= 10;
        // Implement run logic for thief
        System.out.println(name + " is running.");
    }

    @Override
    public void useBuff() {
        // Implement useBuff logic for thief
        System.out.println(name + " uses a buff.");
    }

    @Override
    public void calculateDistance() {
        // Implement calculateDistance logic for thief
        System.out.println(name + " calculates distance.");
    }
}

// Implementing accessory classes
class Weapon implements Accessory {
    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    @Override
    public void applyEffect(RPGCharacter character) {
        // Implement applyEffect logic for weapon
        System.out.println("Applying " + name + " to " + character.getClass().getSimpleName());
    }
}

class Vehicle implements Accessory {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public void applyEffect(RPGCharacter character) {
        // Implement applyEffect logic for vehicle
        System.out.println("Applying " + name + " to " + character.getClass().getSimpleName());
    }
}

class DopeDrink implements Accessory {
    private String name;

    public DopeDrink(String name) {
        this.name = name;
    }

    @Override
    public void applyEffect(RPGCharacter character) {
        // Implement applyEffect logic for dope drink
        System.out.println("Applying " + name + " to " + character.getClass().getSimpleName());
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RPGCharacter p = new Police("Officer Smith", 100, 10, 15, 0);
        RPGCharacter t = new Thief("Sneaky Pete", 80, 15, 20, 0);
//        System.out.println(p.getHP());
        System.out.println("Choose character: P for Police, T for Thief");
        String choice = scanner.nextLine();
        RPGCharacter selectedCharacter = (choice.equalsIgnoreCase("P")) ? p : t;

        Accessory weapon = new Weapon("Gun");
        Accessory vehicle = new Vehicle("Scooter");
        Accessory dopeDrink = new DopeDrink("M150");

        System.out.println("Choose accessory: W for Weapon, V for Vehicle, D for Dope Drink");
        choice = scanner.nextLine();
        Accessory selectedAccessory;
        switch (choice.toUpperCase()) {
            case "W":
                selectedAccessory = weapon;
                break;
            case "V":
                selectedAccessory = vehicle;
                break;
            case "D":
                selectedAccessory = dopeDrink;
                break;
            default:
                selectedAccessory = null;
        }

        if (selectedAccessory != null) {
            selectedAccessory.applyEffect(selectedCharacter);
        }

        System.out.println("To be Continue...... fighter have time to prepare for their fight!");

//        int distance = 50;
//
//        while (p.getHP() > 0 && t.getHP() > 0 && distance > 0) {
//            System.out.println();
//            System.out.println("Current distance: " + distance);
//
//            // Police's turn
//            p.calculateDistance();
//            p.attack();
//            p.useBuff();
//
//            // Thief's turn
//            t.calculateDistance();
//            t.attack();
//            t.useBuff();
//
////             Update distance based on characters' positions
//            int diffDistance;
//            diffDistance = Math.abs(t.getPosition() - p.getPosition());
//            distance -= diffDistance;
//
//            // Display the updated distance
//            System.out.println("Updated distance: " + distance);
//        }
//
//        // Show the winner
//        if (p.getHP() == 0 || distance <= 0){
//            System.out.println("Thief " + t.getName() + " wins!");
//        } else{
//            System.out.println("Police " + p.getName() + " wins!");
//        }

    }



}

