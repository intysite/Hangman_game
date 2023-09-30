package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class WordGenerator {
    private ArrayList<String> words = new ArrayList<>();

    public WordGenerator() {
        try  {
            FileReader fileReader = new FileReader("src/main/resources/nouns.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            while (reader.ready()) {
                words.add(reader.readLine());
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String chooseNewWord() {
        return words.get(new Random().nextInt(words.size()));
    }
}
