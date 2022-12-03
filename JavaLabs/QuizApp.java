import java.util.ArrayList;

enum Type {multipleChoice, TrueFalse}

enum Level {EASY, MEDIUM, HARD, EXTREME}

class Quiz {
    private String id;
    private String title;
    private String summary;
    private int score;
    private boolean isPublished;
    private String hostId;
    ArrayList<Question> questions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void isPublished(boolean b) {
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    /* public Quiz(String id, String title, String summary, int score, boolean isPublished, String hostId, ArrayList<Question> questions) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.score = score;
        this.isPublished = isPublished;
        this.hostId = hostId;
        this.questions = questions;
    }

     */
    @Override
    public String toString() {
        return "";
    }
}

class User {
    private String id;
    private String fname;
    private String lname;
    private String email;
    private String password;
    private boolean isHost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsHost() {
        return getIsHost();
    }

    public void setIsHost(boolean isHost) {
        this.isHost = isHost;
    }

    @Override
    public String toString() {
        return "";
    }
}

class Question {
    private int questionNum;
    private String quizId;
    private Type type;
    private Level level;
    private int score;
    private String questionText;
    private ArrayList<Answer> answers;

    public int getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(int questionNum) {
        this.questionNum = questionNum;
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public Question(int questionNum, String quizId, Type type, Level level, int score, String questionText, ArrayList<Answer> answers) {
        this.questionNum = questionNum;
        this.quizId = quizId;
        this.type = type;
        this.level = level;
        this.score = score;
        this.questionText = questionText;
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "\n" + questionNum + ") " + "(" + score + " points):\n" + questionText + "\n" + answers + "\n";
    }
}

class Answer {
    private String answerOption;
    private String quizId;
    private String questionId;
    private boolean isActive;
    private boolean isCorrect;
    private String answerText;

    public String getAnswerOption() {
        return answerOption;
    }

    public void setAnswerOption(String answerOption) {
        this.answerOption = answerOption;
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Answer(String answerOption, String quizId, String questionId, boolean isActive, boolean isCorrect, String answerText) {
        this.answerOption = answerOption;
        this.quizId = quizId;
        this.questionId = questionId;
        this.isActive = isActive;
        this.isCorrect = isCorrect;
        this.answerText = answerText;
    }

    @Override
    public String toString() {
        return answerOption + ") " + answerText + " ";
    }


}

public class QuizApp {
    ArrayList<Answer> quizAnswersQ1 = new ArrayList<>();
    ArrayList<Answer> quizAnswersQ2 = new ArrayList<>();
    ArrayList<Question> questions = new ArrayList<>();

    Quiz quiz1 = new Quiz();

    public void createQuizQuestions() {

        quizAnswersQ1.add(new Answer("A", "quiz1", "qq1", true, true, "New Hampshire"));
        quizAnswersQ1.add(new Answer("B", "quiz1", "qq1", true, false, "New York"));
        quizAnswersQ1.add(new Answer("C", "quiz1", "qq1", true, false, "New Jersey"));
        quizAnswersQ1.add(new Answer("D", "quiz1", "qq1", true, false, "New England"));

        quizAnswersQ2.add(new Answer("A", "quiz1", "qq2", true, true, "True"));
        quizAnswersQ2.add(new Answer("B", "quiz1", "qq1", true, false, "False"));

        questions.add(new Question(1, "quiz1", Type.multipleChoice, Level.EASY, 5, "Bainbridge Wadleigh was a 1873 U.S. Senator from what state?", quizAnswersQ1));
        questions.add(new Question(2, "quiz1", Type.TrueFalse, Level.EXTREME, 15, "In 1921 the Declaration and the Constitution were moved in a Model-T Ford Truck on a pile of leather U.S mail sacks.", quizAnswersQ2));

    }

    public void createUser() {
        User user = new User();
        user.setId("Purple Hyacinth");
        user.setFname("Kieran");
        user.setLname("White");
        user.setEmail("purpurhya@gmail.com");
        user.setPassword("Lune");
        user.setIsHost(false);

        System.out.println(user.getFname() + " " + user.getLname());
        System.out.println("Email: " + user.getEmail());

    }

    public User createHost() {
        User host = new User();
        host.setId("Detective Sinclair");
        host.setFname("Lauren");
        host.setLname("Sinclair");
        host.setEmail("detectivesinclair@lune.com");
        host.setPassword("Lune");
        host.setIsHost(true);

        return host;
    }

    // "quiz1", "U.S. Government Trivia", "A fun little trivia test about the U.S. government", 20, true, "Detective Sinclair", createQuizQuestions()

    public void createQuiz() {
        quiz1.setId("quiz1");
        quiz1.setTitle("U.S. Government Trivia");
        quiz1.setSummary("A fun little trivia test about the U.S. government.");
        quiz1.setScore(20);
        quiz1.setPublished(true);
        quiz1.setHostId(createHost().getId());
        createQuizQuestions();

        System.out.println("Quiz Topic: " + quiz1.getTitle());
        System.out.println(quiz1.getSummary());
        System.out.println("This quiz is worth " + quiz1.getScore() + " points.\n");

        System.out.println(questions.toString().replace("[", "").replace(", ", "").replace("]", ""));

    }

    public void createHostQuiz() {
        quiz1.setId("quiz1");
        quiz1.setTitle("U.S. Government Trivia");
        quiz1.setSummary("A fun little trivia test about the U.S. government.");
        quiz1.setScore(20);
        quiz1.setPublished(true);
        quiz1.setHostId(createHost().getId());

        System.out.println("Title: " + quiz1.getTitle());
        System.out.println(quiz1.getSummary());
        System.out.println("This quiz is worth " + quiz1.getScore() + " points.\n");
        System.out.println(questions.toString().replace("[", "").replace(", ", "").replace("]", ""));
    }

    public void printQuiz() {
        System.out.println("Host: " + createHost().getId());
        createUser();
        createQuiz();
    }

    public void printHostQuiz() {
        System.out.println("--------------------\n" + "" + "INSTRUCTOR VERSION" + "\n--------------------");
        System.out.println("Hello, " + createHost().getId() + "\n");
        createHostQuiz();
        System.out.println("ANSWER KEY:");
        
        quizAnswersQ1.stream().filter(Answer::isCorrect).forEach(System.out::println);
        quizAnswersQ2.stream().filter(Answer::isCorrect).forEach(System.out::println);
    }


    public static void main(String[] args) {
        QuizApp quizApp = new QuizApp();
        quizApp.printQuiz();
        quizApp.printHostQuiz();
    }
}
