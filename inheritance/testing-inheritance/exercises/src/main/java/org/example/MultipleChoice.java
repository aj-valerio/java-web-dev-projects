package org.example;


import java.util.Scanner;

public class MultipleChoice extends Question {
    private String correctAnswer;
    private String distractor1;
    private String distractor2;
    private String distractor3;

    public MultipleChoice(String questionPrompt, String aCorrectAnswer, String distractor1, String distractor2, String distractor3){
        super(questionPrompt);
        this.correctAnswer = aCorrectAnswer;
        this.distractor1 = distractor1;
        this.distractor2 = distractor2;
        this.distractor3 = distractor3;

    }


    @Override
    public int askQuestion() {
        String[] answerChoices = new String[4];
        int randomizer = (int) Math.floor(Math.random()*4);
        answerChoices[randomizer] = this.correctAnswer;


        Scanner multipleChoicePrompt = new Scanner(System.in);
        System.out.println(questionPrompt);
        System.out.println();
        return 0;
    }
}