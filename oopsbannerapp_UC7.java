public class oopsbannerapp_UC7 {
    static class CharacterPatternMap {

        char letter;
        String[] pattern;

        CharacterPatternMap(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        String[] oPattern = {
                " * ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " * "
        };

        String[] pPattern = {
                "** ",
                "*   *",
                "*   *",
                "** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] sPattern = {
                " **",
                "*    ",
                "*    ",
                " * ",
                "    *",
                "    *",
                "** "
        };

        CharacterPatternMap letterO1 = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap letterO2 = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap letterP = new CharacterPatternMap('P', pPattern);
        CharacterPatternMap letterS = new CharacterPatternMap('S', sPattern);

        CharacterPatternMap[] word = { letterO1, letterO2, letterP, letterS };

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < word.length; j++) {
                System.out.print(word[j].getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }

}
