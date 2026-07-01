import java.util.LinkedHashMap;
import java.util.Map;

public class findduplicateChar {

    public static void main(String [] args) {

        String Str = "Archana Mohini";
        Str = Str.toLowerCase();

        Map<Character, Integer> CharDuplicate = new LinkedHashMap<>();

        for (char ch : Str.toCharArray()) {
            if (Character.isLetter(ch)) {
                CharDuplicate.put(ch, CharDuplicate.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : CharDuplicate.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
