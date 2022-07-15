package katatraining.shortestword;

import java.util.stream.Stream;

public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortestLength = words[0].length();

        for (String word: words) {
            int wordLength = word.length();
            if (wordLength < shortestLength) {
                shortestLength = wordLength;
            }
        }

        return shortestLength;
    }

    public static int findShortAlternative(String s) {
        return Stream.of(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}
