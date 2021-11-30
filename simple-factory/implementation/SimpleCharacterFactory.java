public class SimpleCharacterFactory implements CharacterFactory {
    @Override
    public Character createCharacter(CharacterType type, String name, WeaponType weapon) {

        WeaponBehavior weaponBehavior;

        // Create selected weapon
        switch(weapon) {
            case CLUB:
                weaponBehavior = new Club();
                break;
            case SHOTGUN:
                weaponBehavior = new Shotgun();
                break;
            case SWORD:
                weaponBehavior = new Sword();

            default:
                throw new RuntimeException("Error: " + this.getClass().getName() + " has not yet implemented weapon type " + weapon);
        }

        // Create selected character type
        switch(type) {
            case KNIGHT:
                return new Knight(name, weaponBehavior);
            case ORCH:
                return new Orch(name, weaponBehavior);
            case TROLL:
                return new Troll(name, weaponBehavior);
            default:
                throw new RuntimeException("Error: " + this.getClass().getName() + " has not yet implemented character type " + type);
        }
    }
}
