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