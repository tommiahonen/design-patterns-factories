public interface CharacterFactory {
    enum CharacterType {KNIGHT, ORCH, TROLL};
    enum WeaponType {CLUB, SHOTGUN, SWORD}
    public Character createCharacter(CharacterType type, String name, WeaponType weapon);
}
