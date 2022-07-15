package katatraining.multiplesof3or5;

public class Solution {
    public int solution(int number) {
        int sumMultiplesOfThreeOrFive = 0;

        for (int i = number-1; i >= 3; i--) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumMultiplesOfThreeOrFive += i;
            }
        }

        return sumMultiplesOfThreeOrFive;
    }
}
