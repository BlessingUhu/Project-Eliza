import java.util.Scanner;
import java.util.Random;

public class PromptBank {

    public static Scanner input = new Scanner(System.in);

    String[] questions;
    String[] statements;
    String[] extraStatements;

    public PromptBank() {
        questions = new String[4];
        statements = new String[3];
        extraStatements = new String[3];
    }

    public void populateStatementsArray() {

        statements[0] = "Tell me more about BLANK1 and BLANK2.";
        statements[1] = "BLANK1 seems important to you, so does BLANK2 Please tell me more.";
        statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
    }

    public void populateQuestionsArray() {

        questions[0] = "Is there anything else about BLANK1 and BLANK2?";
        questions[1] = "Does BLANK1 bother you? How about BLANK2.";
        questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
        questions[3] = "I understand what you mean. Does BLANK1 and BLANK2 affect you?";
    }

    public void populateExclamationArray(){

        extraStatements[0] = "WOW! DRAMATIC! Tell me more about BLANK1 and BLANK2.";
        extraStatements[1] = "OH MY GOSH. INTERESTING! BLANK1 seems important to you, so does BLANK2 Please tell me more.";
        extraStatements[2] = "SHEESH! BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
    }

    public String getRandomStatementTrunk() {
        populateStatementsArray();

        Random r = new Random();
        int n = r.nextInt(3);
        return this.statements[n];
    }

    public String getRandomQuestionTrunk() {
        populateQuestionsArray();

        Random r = new Random();
        int n = r.nextInt(4);
        return this.questions[n];
    }

    public String getExclamationTrunk() {
        populateExclamationArray();

        Random r = new Random();
        int n = r.nextInt(3);
        return this.extraStatements[n];
    }



}