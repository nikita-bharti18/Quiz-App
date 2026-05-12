import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "Which language is used for Android Development?",
                "Python", "Java", "C++", "HTML",
                'B'));

        questions.add(new Question(
                "What is the capital of India?",
                "Mumbai", "Delhi", "Kolkata", "Chennai",
                'B'));

        questions.add(new Question(
                "Which data structure uses FIFO?",
                "Stack", "Queue", "Tree", "Graph",
                'B'));

        int score = 0;

        System.out.println("===== Welcome to Quiz App =====\n");

        for (int i = 0; i < questions.size(); i++) {

            Question q = questions.get(i);

            System.out.println((i + 1) + ". " + q.question);
            System.out.println("A. " + q.optionA);
            System.out.println("B. " + q.optionB);
            System.out.println("C. " + q.optionC);
            System.out.println("D. " + q.optionD);

            System.out.print("Enter your answer: ");
            char answer = Character.toUpperCase(sc.next().charAt(0));

            if (answer == q.correctAnswer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct Answer: " + q.correctAnswer + "\n");
            }
        }

        System.out.println("===== Quiz Finished =====");
        System.out.println("Your Score: " + score + "/" + questions.size());

        sc.close();
    }
}
