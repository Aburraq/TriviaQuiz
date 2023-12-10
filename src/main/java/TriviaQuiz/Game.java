package TriviaQuiz;

import java.util.*;

public class Game {

    private ArrayList<Question> questionSet;

    public Game (){

        questionSet = new ArrayList<Question>();

        String q = "Where does run rise?";

        String [] a = {"East", "West", "North", "South"};

        questionSet.add(new Question(q,a,"East"));

        q = "Who invented the telephone";
        a = new String[] {"Thomas Edison", "Alexander Bell", "Tesla", "BB"};
        questionSet.add(new Question(q,a,"Alexander Bell"));

        q = "Where is the capital of Japan";
        a = new String[] {"Berlin", "Tokyo", "Ankara", "London"};
        questionSet.add(new Question(q,a,"Tokyo"));

        Collections.shuffle(questionSet, new Random());

    }

    public void start (){
        Scanner input = new Scanner(System.in);
        int score = 0;

        for (int question = 0; question < questionSet.size(); question++){

            System.out.println(questionSet.get(question).getQuestion());
            int numChoices = questionSet.get(question).getChoices().size();

            for (int choice = 0; choice < numChoices ; choice++){

                System.out.println(choice+1 + " : " +
                        questionSet.get(question).getChoices().get(choice));

            }

            int playerAnswer = input.nextInt();
            ArrayList<String> choiceSet = questionSet.get(question).getChoices();
            String correctAnswer = questionSet.get(question).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if (playerAnswer == correctAnswerIndex +1){

                score++;

            }

        }

        System.out.println("Your score is " + score  );

    }

}
