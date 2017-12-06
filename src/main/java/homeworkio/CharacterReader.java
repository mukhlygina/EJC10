package homeworkio;

import java.io.*;
import java.util.Map;

import static homeworkio.JavaWords.findJavaWords;

public class CharacterReader {

    public static void writeToFile(Map<String, Integer>  data, File destination) throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(destination))) {
            for (String word : data.keySet()) {
                out.write(word + ":" + data.get(word) + " ");
            }
        }
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
