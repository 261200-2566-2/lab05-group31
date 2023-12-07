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
