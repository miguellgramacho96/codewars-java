package katatraining.colorghost;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Ghost {
    private final String color;
    public static final List<String> availableColors = List.of("white", "yellow", "purple", "red");

    public Ghost() {
        color = availableColors.get(ThreadLocalRandom.current().nextInt(0, availableColors.size()));
    }

    public String getColor() {
        return color;
    }
}
