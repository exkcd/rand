import java.util.Scanner;

class Questions
{
    private String text;
    private String answer;

    /**
     Constructs a question with empty question and answer.
     */
    public Questions()
    {
        text = "";
        answer = "";
    }

    /**
     Sets the question text.
     @param questionText the text of this question
     */
    public void setText(String questionText)
    {
        text = questionText;
    }

    /**
     Sets the answer for this question.
     @param correctResponse the answer
     */
    public void setAnswer(String correctResponse)
    {
        answer = correctResponse;
    }

    /**
     Checks a given response for correctness.
     @param response the response to check
     @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response)
    {
        return response.equals(answer);
    }

    /**
     Displays this question.
     */
    public void display()
    {
        System.out.println(text);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Questions q1 = new Questions();
        q1.setText("Who was the inventor of Java?");
        q1.setAnswer("James Gosling");

        q1.display();
        System.out.print("Your answer: ");
        String r1 = in.nextLine();
        System.out.println(q1.checkAnswer(r1));

        Questions q2 = new Questions();
        q2.setText("Who was the US Senator that ran from 1869-1872 from New Hampshire?");
        q2.setAnswer("Bainbridge Wadleigh");

        q2.display();
        System.out.print("Your answer: ");
        String r2 = in.nextLine();
        System.out.println(q2.checkAnswer(r2));

        Questions q3 = new Questions();
        q3.setText("Who is claimed to be the founder of artificial intelligence?");
        q3.setAnswer("Alan Turing");

        q3.display();
        System.out.print("Your answer: ");
        String r3 = in.nextLine();
        System.out.println(q2.checkAnswer(r3));
    }
}
