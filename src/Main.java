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

        /*
            next
            step1 calculate accessory to increase character's stat
            step2 choose action
            step3 check who will win (draft 2 : While (HP some = 0 || distance.t = 100 || diff distance = 0 ){
                                                    calculateDistance();
                                                    attack();
                                                    useBuff();
                                                    attack();   } )

         */

    //After this line is 1st draft version >>> can delete with new code>>>>
        // \/\/\/\/\/\/\/ //
//        System.out.println("To be Continue...... fighter have time to prepare for their fight!");

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

