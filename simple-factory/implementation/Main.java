public class Main {
    public static void main(String[] args) {
        CharacterFactory cFactory = new SimpleCharacterFactory();
        Character c1 = cFactory.createCharacter(CharacterFactory.CharacterType.TROLL, "Lillfjant", CharacterFactory.WeaponType.CLUB);
        Character c2 = cFactory.createCharacter(CharacterFactory.CharacterType.KNIGHT, "Sir James", CharacterFactory.WeaponType.SWORD);
        Character c3 = cFactory.createCharacter(CharacterFactory.CharacterType.KNIGHT, "Fistfighting Black Knight", CharacterFactory.WeaponType.NONE);
    }
}
