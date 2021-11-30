public class Main {
    public static void main(String[] args) {
        CharacterFactory cFactory = new SimpleCharacterFactory();
        Character c1 = cFactory.createCharacter("Lillfjant", CharacterType.TROLL, WeaponType.CLUB);
        Character c2 = cFactory.createCharacter("Sir James", CharacterType.KNIGHT, WeaponType.SWORD);
        Character c3 = cFactory.createCharacter("Fistfighting Black Knight", CharacterType.KNIGHT, WeaponType.UNARMED);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
