/**
   A question with a text and an answer.
*/
package lab2;
/**
 * 
 * @author williamgusmanov
 *
 */
abstract public class Question
{
   private String text;
   private String answer;

   /**
      Constructs a question with empty question and answer.
   */
   public Question() 
   {
      text = "";
      answer = "";
   }
   /**
    * Constructs question and answer with input parameters
    * @param Text
    * @param Answer
    */
   public Question(String Text, String Answer) {
	
	   text = Text;
	   answer = Answer;
   }

   /**
      Sets the question text.
      @param questionText, the text of this question
   */
   public void setText(String questionText)   
   {
      text = questionText;
   }

   /**
      Sets the answer for this question.
      @param correctResponse, the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
   }
   public String GetAnswer() {
	return answer; 
   }
   /**
      Checks a given response for correctness.
      @param response, the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {	
	   //System.out.println("Current Answer:" + this.GetAnswer());
	   if (response == this.GetAnswer()) {
		   return true;
	   }
	   if (response.equals(this.GetAnswer())) {
		   return true; 
	   }
	   if (response.toLowerCase().replace(" ", "") .equals(this.GetAnswer().toLowerCase().replace(" ", ""))) {
		   return true;
	   }
	   return false; 
   }

   /**
      Displays this question.
   */
   public void display()
   {
      System.out.println(text);
   }
}
