class Weapon implements Accessory {
    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    @Override
    public void applyEffect(RPGCharacter character) {
        System.out.println("Applying " + name + " to " + character.getClass().getSimpleName());
    }
}