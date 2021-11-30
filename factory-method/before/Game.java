public class Game{
  public static void main(String[] args){

    CharacterFactory characterFactory = new KnightFactory();
    Character sirJames = characterFactory.createCharacter(WeaponType.SWORD, "Sir James");
    Character blackKnight = characterFactory.createCharacter(WeaponType.UNARMED, "Fistfighting Black Knight");

    characterFactory = new OrchFactory();
    Character evilOrch = characterFactory.createCharacter(WeaponType.SHOTGUN, "Ugly scary Orch");
    Character unarmedOrch = characterFactory.createCharacter(WeaponType.UNARMED,  "Ugly scary unarmed Orch");

    System.out.println(sirJames);
    System.out.println(blackKnight);
    System.out.println(evilOrch);
    System.out.println(unarmedOrch);

    /*
    CharacterFactory cFactory = new SimpleCharacterFactory();
    Character troll = 
      cFactory.createCharacter(CharacterType.TROLL,
                               WeaponType.CLUB,
                               "Lillfjant");
    Character sirJames =
      cFactory.createCharacter(CharacterType.KNIGHT,
                               WeaponType.SWORD,
                               "Sir James");
    Character blackKnight =
      cFactory.createCharacter(CharacterType.KNIGHT,
                               WeaponType.UNARMED,
                               "Fistfighting Black Knight");
    Character evilOrch =
      cFactory.createCharacter(CharacterType.ORCH,
                               WeaponType.SHOTGUN,
                               "Ugly scary Orch");
    Character unarmedOrch =
      cFactory.createUnarmedCharacter(CharacterType.ORCH,
                                      "Ugly scary unarmed Orch");
    System.out.println(troll);
    System.out.println(sirJames);
    System.out.println(blackKnight);
    System.out.println(evilOrch);
    System.out.println(unarmedOrch);
    */
  }

}
