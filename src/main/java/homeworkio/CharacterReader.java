package homeworkio;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterReader {
    public ArrayList<String> javaWords = new ArrayList<>();
    public static String[] words = {"while", "for", "if", "else", "switch", "case",
            "default", "do", "break", "continue", "try", "catch", "finally", "throw", "throws", "private",
            "protected", "public", "import", "package", "class", "interface", "extends", "implements", "static",
            "final", "void", "abstract", "new", "return", "this", "super", "synchronized", "volatile",
            "byte", "short", "int", "long", "char", "float", "double", "boolean"};

    public static void writeToFile(Map<String, Integer>  data, File destination) throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(destination))) {
            for (String word : data.keySet()) {
                out.write(word + ":" + data.get(word) + " ");
            }
        }
    }

    public static Map<String, Integer> findJavaWords(String data) {
        Map<String, Integer> foundWords = new HashMap<>();
        for(String string : words) {
            Pattern pattern = Pattern.compile(string);
            Matcher matcher = pattern.matcher(data);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            if(count != 0) {
                foundWords.put(string, count);
            }
        }

        return foundWords;
    }

    public static String readFile(File source) throws IOException {
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String s;
            while ((s = reader.readLine()) != null) {
                data.append(s);
            }
        }
        return data.toString();
    }

    public static void readFileAndWriteJavaWords(File source, File destination) throws IOException {
        String text = readFile(source);
        Map<String, Integer>  javaWords = findJavaWords(text);
        writeToFile(javaWords, destination);
    }

    public static void main(String[] args) throws IOException {
        File source = new File("src\\main\\java\\homework1\\TrafficLight.java");
        File destination = new File("Zoo.txt");
        readFileAndWriteJavaWords(source, destination);
    }
}
