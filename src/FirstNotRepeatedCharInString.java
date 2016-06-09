import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by akrzos on 2016-06-07.
 */
public class FirstNotRepeatedCharInString {

    static char findFirstNotRepeatedCharInString(String string) {
        Map<Character, Integer> mapa= new LinkedHashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (mapa.containsKey(string.charAt(i))) {
                mapa.put(string.charAt(i),2);
            } else {
                mapa.put(string.charAt(i),1);
            }
        }
        for (Character character : mapa.keySet()) {
            if (mapa.get(character)==1) {
                return  character;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String test= "121JestemB2urakiem";
        System.out.println("First non repeated "  +findFirstNotRepeatedCharInString(test));
    }

}
