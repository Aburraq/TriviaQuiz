package TriviaFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question {

    private String fileName = "C:\\Users\\alibu\\IdeaProjects\\TriviaQuiz\\src\\main\\resources\\QuestionSet";
    private List<String> questions;

    public Question() {

        this.questions = loadQuestions();

    }

    private List<String> loadQuestions() {

        List<String> loadedQuestions = new ArrayList<>();
        try  {

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            StringBuilder question = new StringBuilder();

            while ((line = reader.readLine()) != null) {

                if (line.equals("%")) {

                    loadedQuestions.add(question.toString());
                    question = new StringBuilder();

                } else {

                    question.append(line).append("\n");

                }
            }
        } catch (IOException e) {

            e.printStackTrace();

        }
        return loadedQuestions;
    }

    public void askQuestion(int index) {

        if (index >= 0 && index < questions.size()) {

            System.out.print(questions.get(index));

        } else {

            System.out.println("check askQuestion method");

        }
    }

    public int numberOfQuestions() {

        return questions.size();

    }
}



