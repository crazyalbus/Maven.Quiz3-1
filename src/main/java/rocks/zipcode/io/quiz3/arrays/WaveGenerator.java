package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        List<String> wave = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                String p1 = str.substring(0, i).toLowerCase();
                String p2 = str.substring(i, i + 1).toUpperCase();
                String p3 = str.substring(i + 1).toLowerCase();
                wave.add(p1 + p2 + p3);
            }
        }
        return wave.toArray(new String[wave.size()]);
    }



}
