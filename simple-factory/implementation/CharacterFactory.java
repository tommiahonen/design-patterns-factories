public interface CharacterFactory {
    enum CharacterType {KNIGHT, ORCH, TROLL};
    enum WeaponType {CLUB, SHOTGUN, SWORD, NONE}
    public Character createCharacter(CharacterType type, String name, WeaponType weapon);
}
