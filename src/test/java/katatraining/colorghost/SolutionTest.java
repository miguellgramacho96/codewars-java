package katatraining.colorghost;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testSomething() {
        Ghost ghost = new Ghost();
        assertTrue(Ghost.availableColors.contains(ghost.getColor()));
    }
}
