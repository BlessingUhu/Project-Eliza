import java.util.Scanner;

// LOOK HERE: video explanation link:
//-----------------> https://youtu.be/b5BGA9hOeFE

public class ProjectEliza {

    public static Scanner input = new Scanner(System.in);

    public void firstAndLastWords () {
        PromptBank prompt = new PromptBank();

        //Variables

        String t;
        String s;
        String [] word1;
        String word2;
        String userName;
        String[] response = new String[50];

        System.out.println("Hello, my name is Eliza. What is your name?");

        userName = input.nextLine();

        System.out.println("Hello, " + userName + ". Tell me what is on your mind today in 1 sentence.");


            for (int j = 0; j < 50; j++) {

                response[j] = input.nextLine();

                //getting first and last Strings
                word1 = response[j].split(" ",0);
                word2 = response[j].substring(response[j].lastIndexOf(" ") + 1);

                //removing the punctuation marks to have a clear sentence
                if (word2.endsWith("!") || word2.endsWith(".") || word2.endsWith("?")) {
                    word2 = word2.substring(0, word2.length() - 1);

                }
                if (response[j].endsWith("?")) {

                    t = prompt.getRandomQuestionTrunk().replaceAll("BLANK1", word1[0]);
                    s = t.replaceAll("BLANK2", word2);

                    System.out.println(s);

                }

                else if (word1[0].endsWith("!")) {

                    //removing last punctuation mark
                    String n = word1[0];
                    n = n.substring(0, n.length()-1);

                    t = prompt.getExclamationTrunk().replaceAll("BLANK1", n);
                    s = t.replaceAll("BLANK2", n);

                    System.out.println(s);


                } else if (word1[0].equalsIgnoreCase("Exit")) {

                    System.out.println("Do you want to run the session again?");
                    String k = input.nextLine();

                    if(k.equalsIgnoreCase("No")){
                        System.out.println("Goodbye, until next time.");

                        break;
                    }
                   else if (k.equalsIgnoreCase("Yes")) {
                        System.out.println("Hello, " + userName + ". Tell me what is on your mind today in 1 sentence.");
                    }

                } else {

                    t = prompt.getRandomStatementTrunk().replaceAll("BLANK1", word1[0]);
                    s = t.replaceAll("BLANK2", word2);

                    System.out.println(s);

                }
            }
        }


    public static void main(String[] args) {

        ProjectEliza obtain = new ProjectEliza();

        obtain.firstAndLastWords();

        input.close();

    }

}
