import java.util.HashMap;
import java.util.Map;

public class oopsbannerapp_UC8 {
    static Map<Character, String[]> createMap() {

        Map<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
                " * * * ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " * * * "
        });

        charMap.put('P', new String[] {
                "* * * * ",
                "*      *",
                "*      *",
                "* * * * ",
                "*       ",
                "*       ",
                "*       "
        });

        charMap.put('S', new String[] {
                " * * * * ",
                "*        ",
                "*        ",
                " * * * * ",
                "        *",
                "        *",
                " * * * * "
        });

        return charMap;
    }

    public static void main(String[] args) {

        Map<Character, String[]> charMap = createMap();
        char[] word = { 'O', 'O', 'P', 'S' };

        for (int i = 0; i < 7; i++) {
            for (char key : word) {
                System.out.print(charMap.get(key)[i] + "  ");
            }
            System.out.println();
        }
    }

}
