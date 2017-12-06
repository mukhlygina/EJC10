package homeworkio;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaWords {
    public static String[] words = {"while", "for", "if", "else", "switch", "case",
            "default", "do", "break", "continue", "try", "catch", "finally", "throw", "throws", "private",
            "protected", "public", "import", "package", "class", "interface", "extends", "implements", "static",
            "final", "void", "abstract", "new", "return", "this", "super", "synchronized", "volatile",
            "byte", "short", "int", "long", "char", "float", "double", "boolean"};

    public static Map<String, Integer> findJavaWords(String data) {
        Map<String, Integer> foundWords = new HashMap<>();
        for(String word : words) {
            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(data);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            if(count != 0) {
                foundWords.put(word, count);
            }
        }
        return foundWords;
    }

}
