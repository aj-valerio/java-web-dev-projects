package org.example;
import java.util.Scanner;
public abstract class Question {
    //universal properties:
    String questionPrompt;
    int correctAnswer; //Correct answer will add 1 to score, incorrect will add 0.
    int score;
    Scanner userInput = new Scanner(System.in);

    public Question(String questionPrompt) {
        this.questionPrompt = questionPrompt;
    }

    //universal methods:
    public abstract int askQuestion()




}


//prompt: what does the question prompt to the user? String
//Scanner object: How can our question take in user input via string?
//
//Question as superclass containing properties and methods for all.  The other 3 would be subclasses that extend question.
//Number of possible responses, user input handler functions
//Determine method askQuestion:
//returnResponse():
//updateScore() perhaps something used in the QuizRunner class
//Within subclasses, define how each subclass  would handle the unique methods for question type
//format to store questions? Arraylist Key: numeric? Value: String of the question
//Should we convert all answers to Upper/Lower case?
//Class QuizRunner with only a Main method.  Quiz runner will assemble questions and serve them to user
//