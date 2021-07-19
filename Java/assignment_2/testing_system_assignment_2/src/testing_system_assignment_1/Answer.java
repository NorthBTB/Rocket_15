package testing_system_assignment_1;

public class Answer {
	private int answerID;
	private String content;
	private Question question;
	private Boolean isCorrect;
	
	public Answer(int answerID, String content, Question question, Boolean isCorrect) {
		super();
		this.answerID = answerID;
		this.content = content;
		this.question = question;
		this.isCorrect = isCorrect;
	}

	public int getAnswerID() {
		return answerID;
	}

	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Boolean getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
}
