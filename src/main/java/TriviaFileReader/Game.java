package TriviaFileReader;

import java.util.Scanner;

public class Game {

    private String[] answerKey = {
            "C", // What is the capital of Germany?
            "B", // What programming language is known for its use in developing iOS applications?
            "C", // What does CSS stand for in web development?
            "A", // In JavaScript, what function is used to print data to the console?
            "B", // What data structure uses the principle of First In, First Out (FIFO)?
            "B", // Which sorting algorithm repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order?
            "A", // What does HTML stand for in web development?
            "B", // What does API stand for in software development?
            "B"  // What does OOP stand for in programming?
    };
    public void play() {

        System.out.println("--------------------Welcome to Trivia Game!--------------------");
        System.out.println("Please answer the questions by pressing 'A','B','C','D' letters");
        System.out.println("You can press 'q' to quit the game.");

        Question question = new Question();
        Scanner input = new Scanner(System.in);
        String playerAnswer;
        int score = 0;
        int numQuestions = question.numberOfQuestions();

        for (int i = 0; i < numQuestions; i++) {

            question.askQuestion(i);
            playerAnswer = input.next();

            if (playerAnswer.equalsIgnoreCase(answerKey[i])) {

                score++;
                System.out.println("Correct :)");

            } else if (playerAnswer.equalsIgnoreCase("q")) {

                System.out.println("Quiter .s");
                break;

            } else {

                System.out.println("Incorrect :(");
            }
        }

        System.out.println("Your score is " + score);
    }
}
