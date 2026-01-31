import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Preferred language for Android Development?", "Java", "Kotlin", "Swift", "Dart",
                "Kotlin");
        questions[1] = new Question(2, "What does JVM stand for?", "Java Variable Machine", "Java Virtual Machine",
                "Java Verified Machine", "Java Visual Machine", "Java Virtual Machine");
        questions[2] = new Question(3, "Which company developed Java?", "Microsoft", "Sun Microsystems", "Google",
                "Apple", "Sun Microsystems");
        questions[3] = new Question(4, "Which keyword is used to inherit a class in Java?", "this", "super", "extends",
                "implements", "extends");
        questions[4] = new Question(5, "Which of these is not a Java feature?", "Object-oriented",
                "Platform-independent", "Use of pointers", "Robust", "Use of pointers");

    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A. " + q.getOpt1());
            System.out.println("B. " + q.getOpt2());
            System.out.println("C. " + q.getOpt2());
            System.out.println("D. " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: " + score + " out of " + questions.length);
    }
}
