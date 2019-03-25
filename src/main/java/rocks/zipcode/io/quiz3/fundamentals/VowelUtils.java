package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        boolean status = false;

        for (int i = 0; i < word.length(); i++) {
            if(isVowel(word.charAt(i))) {
                status = true;
                break;
            }
        }
        return status;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if(isVowel(word.charAt(i))) {
                int index = i;
                return index;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        String letterToString = Character.toString(character);
        String[] vowels = new String[]{"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        List<String> vowelList = Arrays.asList(vowels);

        return vowelList.contains(letterToString);
    }
}
