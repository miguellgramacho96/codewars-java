package katatraining.stopspinningmywords;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinWords {
    public String spinWords(String sentence) {
        return Stream.of(sentence.split(" "))
                .map((s) -> {
                    if (s.length() < 5) {
                        return s;
                    }
                    return new StringBuilder(s).reverse().toString();
                })
                .collect(Collectors.joining(" "));
    }
}
