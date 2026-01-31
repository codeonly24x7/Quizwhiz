public class QuestionService {

    Question[] questions = new Question[5];

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

    public void displayQuestions() {
        for (Question q : questions) {
            System.out.println(q);
        }
    }
}
