public class SimpleWeaponFactory implements WeaponFactory {
    @Override
    public WeaponBehavior createWeapon(WeaponType type) {
        // Create selected weapon
        switch(type) {
            case CLUB:
                return new Club();
            case SHOTGUN:
                return new Shotgun();
            case SWORD:
                return new Sword();
            case UNARMED:
                return null;
            default:
                throw new RuntimeException("Error: " + this.getClass().getName() + " has not yet implemented weapon type " + type);
        }
    }
}
