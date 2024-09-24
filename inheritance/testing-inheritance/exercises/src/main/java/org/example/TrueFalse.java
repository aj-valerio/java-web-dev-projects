package org.example;
import java.util.Scanner;

public class TrueFalse extends Question {
    //true is 0, false is 1, cannot use boolean as it has an inherit value;

    int t;
    int f;

    public TrueFalse (String questionPrompt, int aTrue, int aFalse) {
        super(questionPrompt);
        this.t = aTrue;
        this.f = aFalse;


    }

    @Override
    public int askQuestion() {

        Scanner trueFalsePrompt = new Scanner(System.in);
        System.out.println(questionPrompt);
        System.out.println("Type 0 for True, or 1 for false: ");

        int trueFalseAns =  trueFalsePrompt.nextInt();

        if (trueFalseAns == t) {
            System.out.println("Correct!");
            trueFalsePrompt.close();
            return 1;
        } else if (trueFalseAns == f) {
            System.out.print("Correct!");
            trueFalsePrompt.close();
            return 1;
        } else {
            System.out.println("Incorrect.");
            trueFalsePrompt.close();
            return 0;
        }
    }
}
