package homeworkio;

import java.io.*;
import java.util.Map;

import static homeworkio.JavaWords.findJavaWords;

public class ByteReader {

    public static String readFile(File source) throws IOException {
        byte [] bytes = new byte[1024];
        ByteArrayOutputStream readBytes = new ByteArrayOutputStream();
        try(BufferedInputStream reader = new BufferedInputStream(new FileInputStream(source));) {
            int number = 0;
            while((number = reader.read(bytes)) != -1) {
               readBytes.write(bytes, 0, number);
            }
        }
        return readBytes.toString();
    }

    public static void writeData(Map<String, Integer> data, File destination) throws IOException {
        try(BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(destination));) {
            for (String word : data.keySet()) {
                writer.write((word + ":" + data.get(word) + " ").getBytes());
            }
        }
    }

    public static void readAndWriteFile(File source, File destination) throws IOException {
        String data = readFile(source);
        Map<String, Integer> javaWords = findJavaWords(data);
        writeData(javaWords, destination);
    }

    public static void main(String[] args) throws IOException {
        File source = new File("src\\main\\java\\homework1\\TrafficLight.java");
        File destination = new File("ZooByte.txt");
        readAndWriteFile(source, destination);
    }
}
