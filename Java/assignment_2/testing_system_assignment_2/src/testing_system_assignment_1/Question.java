package testing_system_assignment_1;

import java.util.Date;

public class Question {
	private int questionID;
	private String content;
	private CategoryQuestion category;
	private TypeQuestion type;
	private Account creator;
	private Date createDate;
	
	public Question(int questionID, String content, CategoryQuestion category, TypeQuestion type, Account creator,
			Date createDate) {
		super();
		this.questionID = questionID;
		this.content = content;
		this.category = category;
		this.type = type;
		this.creator = creator;
		this.createDate = createDate;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CategoryQuestion getCategory() {
		return category;
	}

	public void setCategory(CategoryQuestion category) {
		this.category = category;
	}

	public TypeQuestion getType() {
		return type;
	}

	public void setType(TypeQuestion type) {
		this.type = type;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
