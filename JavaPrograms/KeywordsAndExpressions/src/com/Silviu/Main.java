package com.Silviu;

public class Main {

    public static void main(String[] args) {
	// if and codeBlocks

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score == 5000)
            System.out.println("your score was 5000");
        System.out.println("This is executed no matter what");

        if(score < 5000 && score >1000){
            System.out.println("your score was less than 5000 but greater than 1000");
        }else if (score < 1000){
            System.out.println("score less than 1000");
        }else{
            System.out.println("got here");
        }


        finalScore(gameOver, score, levelCompleted, bonus);

//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//        if(gameOver){
//            int finalScore = newScore + (newLevelCompleted*newBonus);
//            System.out.println("new final score is: " + finalScore);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);  //variables created in the code block are deleted after exiting
//            System.out.println("your final score is: " + finalScore);
//        }
        finalScore(gameOver, score, levelCompleted, bonus);

    }

    private static void finalScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);  //variables created in the code block are deleted after exiting
            finalScore += 1000;
            System.out.println("your final score is: " + finalScore);
        }
    }
}
