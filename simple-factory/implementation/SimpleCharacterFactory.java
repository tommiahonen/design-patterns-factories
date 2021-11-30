public class SimpleCharacterFactory implements CharacterFactory {

    private static WeaponFactory weaponFactory = new SimpleWeaponFactory();
    @Override
    public Character createCharacter(String name, CharacterType characterType, WeaponType weaponType) {

        WeaponFactory wFactory = new SimpleWeaponFactory();

        // Create selected character type
        switch(characterType) {
            case KNIGHT:
                return new Knight(name, weaponFactory.createWeapon(WeaponType.SWORD));
            case ORCH:
                return new Orch(name, weaponFactory.createWeapon(weaponType));
            case TROLL:
                return new Troll(name, weaponFactory.createWeapon(weaponType));
            default:
                throw new RuntimeException("Error: " + this.getClass().getName() + " has not yet implemented character type " + characterType);
        }
    }
}
