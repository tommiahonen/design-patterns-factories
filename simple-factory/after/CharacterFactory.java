public interface CharacterFactory {
    public Character createCharacter(String name,
                                     CharacterType character,
                                     WeaponType weapon);

    public Character createUnarmedCharacter(CharacterType character,
                                            String name);
}
