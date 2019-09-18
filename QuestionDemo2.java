package lab2;

import java.util.Scanner;

/**
   This program shows a simple quiz with two choice questions.
*/
public class QuestionDemo2
{
	static Scanner in = new Scanner(System.in);
    
   public static void main(String[] args)
   {
	 ChoiceQuestion first = new ChoiceQuestion();
	  first.setText("What was the original name of the Java language?");
      first.addChoice("*7", false);
      first.addChoice("Duke", false);
      first.addChoice("Oak", true);
      first.addChoice("Gosling", false);

      ChoiceQuestion second = new ChoiceQuestion();
      second.setText("In which country was the inventor of Java born?");
      second.addChoice("Australia", false);
      second.addChoice("Canada", true);
      second.addChoice("Denmark", false);
      second.addChoice("United States", false);
      TrueFalseQuestion test = new TrueFalseQuestion("It is possible to override every single method that you inherit from a supertype.", false);
      
      Question[] questions = new Question[] {first, second, test};
      for (Question question : questions) {
    	  presentQuestion(question);
      }
      in.close();
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static void presentQuestion(Question q)
   {
      q.display();
      System.out.print("Your answer:");
      String response = in.nextLine();
      //System.out.println("The answer you put in is :" + response);
      System.out.println(q.checkAnswer(response));
   }
}