package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String p1 = str.substring(0, indexToCapitalize);
        String p2 = str.substring(indexToCapitalize,indexToCapitalize+1).toUpperCase(); //Nhu used Character class
        String p3 = str.substring(indexToCapitalize+1);

        return p1 + p2 + p3;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> substrings = new HashSet<>();

        for (int i = 0; i <= string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                substrings.add(string.substring(i,j));
            }
        }

        return substrings.toArray(new String[substrings.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
