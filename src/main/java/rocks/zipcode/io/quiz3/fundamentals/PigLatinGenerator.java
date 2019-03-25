package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        String[] strAsArray = str.split(" ");

        StringBuilder newString = new StringBuilder();

        String translated = "";

        if (strAsArray == null) {
            translated = translateWord(str);
        } else {
            for (String word : strAsArray) {
                String newWord = translateWord(word) + " ";
                newString.append(newWord);
            }
        }
        newString.deleteCharAt(newString.length() - 1);

        return newString.toString();
    }


    public String translateWord(String word) {
        String newWord = word;
        if (VowelUtils.isVowel(word.charAt(0))) {
            newWord = word + "way";
        } else if (!VowelUtils.hasVowels(word)) {
            newWord = word + "ay";
        } else {
            int index = VowelUtils.getIndexOfFirstVowel(word);
            String s1 = newWord.substring(0, index);
            String s2 = newWord.substring(index);
            newWord = s2 + s1 + "ay";
        }
        return newWord;
    }
}
