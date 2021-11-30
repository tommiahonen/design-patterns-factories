public class KnightFactory implements CharacterFactory {

    private static WeaponFactory weaponFactory = new SimpleWeaponFactory();

    @Override
    public Character createCharacter(WeaponType weapon, String name) {
        return new Knight(name, weaponFactory.createWeapon(weapon));
    }

    @Override
    public Character createUnarmedCharacter(String name) {
        return new Knight(name, weaponFactory.createWeapon(WeaponType.UNARMED));
    }
}
