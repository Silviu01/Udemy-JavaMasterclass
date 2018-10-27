package com.Silviu;

public class Main {

    public static void main(String[] args) {
        // write your code here

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);  //variables created in the code block are deleted after exiting
//            finalScore += 1000;
//            System.out.println("your final score is: " + finalScore);
//        }
//        calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(true, calculateScore(gameOver, score, levelCompleted, bonus), 8, 200);

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);  //variables created in the code block are deleted after exiting
//            System.out.println("your final score is: " + finalScore);
//        }
        calculateScore(true, 10000, 8, 200);

        int position = calculateHighScorePosition(150);
        displayHighScorePosition("Silviu", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {    //passing information to the method through parameters
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);  //variables created in the code block are deleted after exiting
            finalScore += 2000;
            System.out.println("your final score is: " + finalScore);
            return finalScore;}
//        }else{
//            return -1;
//        }
            return -1;  //invalid value, of value not found
    }

    public static void displayHighScorePosition (String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition (int score){
//        if(score >= 1000){
//            return 1;
//        }else if (score >= 500){
//            return 2;
//        }else if(score >= 100){
//            return 3;
//        }
//        return 4;
        int position = 4;
        if(score >= 1000){
            position = 1;
        }else if (score >= 500){
            position = 2;
        }else if(score >= 100){
            position = 3;
        }
        return position;
    }
}
