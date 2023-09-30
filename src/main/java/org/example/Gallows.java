package org.example;

public class Gallows {
    public static void printGallows(int countMistakes) {
        switch (countMistakes) {
            case 1:
                System.out.println(
                        "==============\n" +
                        " ||        |\n" +
                        " ||        O\n" +
                        " ||\n" +
                        " ||\n" +
                        " ||\n" +
                        " ||\n" +
                        "==============\n" +
                        " ||        ||");
                break;

            case 2:
                System.out.println(
                        "==============\n" +
                                " ||        |\n" +
                                " ||        O\n" +
                                " ||        |\n" +
                                " ||\n" +
                                " ||\n" +
                                " ||\n" +
                                "==============\n" +
                                " ||        ||");
                break;

            case 3:
                System.out.println(
                        "==============\n" +
                                " ||        |\n" +
                                " ||      __O\n" +
                                " ||        |\n" +
                                " ||\n" +
                                " ||\n" +
                                " ||\n" +
                                "==============\n" +
                                " ||        ||");
                break;
            case 4:
                System.out.println(
                        "==============\n" +
                                " ||        |\n" +
                                " ||      __O__\n" +
                                " ||        |\n" +
                                " ||\n" +
                                " ||\n" +
                                " ||\n" +
                                "==============\n" +
                                " ||        ||");
                break;

            case 5:
                System.out.println(
                        "==============\n" +
                                " ||        |\n" +
                                " ||      __O__\n" +
                                " ||        |\n" +
                                " ||       /\n" +
                                " ||\n" +
                                " ||\n" +
                                "==============\n" +
                                " ||        ||");
                break;

            case 6:
                System.out.println(
                        "==============\n" +
                                " ||        |\n" +
                                " ||      __O__\n" +
                                " ||        |\n" +
                                " ||       / \\\n" +
                                " ||\n" +
                                " ||\n" +
                                "==============\n" +
                                " ||        ||");
                break;
        }
    }
}
