package lab2;
/**
 * TrueFalseQuestion, a question with an answer of either true or false.
 * @author williamgusmanov
 *
 */
public class TrueFalseQuestion extends Question {
	/**
	 * Constructor
	 * @param question, question as string
	 * @param answer, if question has an answer of true or false 
	 */
	TrueFalseQuestion(String question, boolean answer){
		super.setText(question);
		if (answer) super.setAnswer("T");
		else {
			super.setAnswer("F");
		}
	}
	/**
	 * overrides display method, displays true or false question
	 */
	@Override
	public void display(){
		System.out.print("True (T) or False(F): ");
		super.display();
	}
	/**
	 * overrides CheckAnswer, returns true if answer is correct, false if not.
	 * @param response, takes user response and checks for correctness
	 */
	@Override
	public boolean checkAnswer(String response) {
		response = response.substring(0,1);
		response = response.toUpperCase();
		return super.checkAnswer(response);
	}
}
