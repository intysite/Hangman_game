package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman_app {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        WordGenerator wordGenerator = new WordGenerator();

        do {
            System.out.println("\n1 - начать новую игру. \n2 - завершить игру.");
            int input = Integer.parseInt(scanner.nextLine());
            if(input == 1) {
                System.out.println("Игра начинается!");
                gameLoop(wordGenerator);
            } else {
                break;
            }
        } while (true);
    }

    public static void gameLoop(WordGenerator wordGenerator) {
        char[] word = wordGenerator.chooseNewWord().toCharArray();
        char[] hiddenWord = new char[word.length];
        Arrays.fill(hiddenWord, '_');
        ArrayList<Character> mistakesLetters = new ArrayList<Character>();
        int countMistakes = 0;
        System.out.println("Загадано слово:");
        System.out.println(hiddenWord);

        do {

            char letter = inputLetter();
            for (int i = 0; i < word.length; i++) {
                if(word[i] == letter) {
                    hiddenWord[i] = letter;
                }
            }

            if(Arrays.toString(hiddenWord).indexOf(letter) == -1) {
                countMistakes++;
                Gallows.printGallows(countMistakes);
                mistakesLetters.add(letter);
                System.out.println("Такой буквы в этом слове нет");
                System.out.println(mistakesLetters);
                System.out.println(hiddenWord);
                if (countMistakes == 6) {
                    System.out.println("Игра окончена. Вы проиграли.");
                    System.out.println("Было загадано слово");
                    System.out.println(word);
                    return;
                }
            } else {
                System.out.println(hiddenWord);
                if(Arrays.equals(hiddenWord, word)) {
                    System.out.println("Вы выиграли!");
                    return;
                }
            }
        } while (true);
    }

    public static char inputLetter() {
        System.out.println("Введите букву:");
        char[] input = scanner.nextLine().toCharArray();
        return input[0];
    }
}
