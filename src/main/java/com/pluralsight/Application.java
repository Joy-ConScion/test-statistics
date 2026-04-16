package com.pluralsight;

import java.util.Arrays;

//Step 1
public class Application {
    public static void main(String[] args) {
        int[] testScores = {100, 28, 13, 51, 73, 81, 86, 91, 63, 0};
        int sum = 0;

        Arrays.sort(testScores);
        for (int testScore : testScores) {
            System.out.println(testScore);
            sum += testScore;
        }
        //Average
        int average = (int) sum / testScores.length;
        System.out.println("The average test score for the class is " + average);
//        High Score
        int highest = testScores.length - 1;
        System.out.println("The highest test score for the class is " +testScores[highest]);
//        Low Score
        System.out.println("The lowest test score for the class is " + (testScores[0]));
    }
//    Median



}
