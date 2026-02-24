class GameManagement {
    static GameCharacter[] characters = new GameCharacter[100];
    static int length = 0;

    public static void addCharacter(GameCharacter character) {
        if (length == 100)
            return;
        characters[length] = character;
        length++;
    }

    public static void deleteCharacter(GameCharacter character) {

        if (length == 0)
            return;

        for (int i = 0; i < length; i++) {
            if (characters[i] == character) {
                for (int j = i; j < length - 1; j++) {
                    characters[j] = characters[j + 1];
                }
                length--;
                break;
            }
        }
    }
}
