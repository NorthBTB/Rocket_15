package testing_system_assignment_1;

import java.util.Date;

public class Exam {
	private int examID;
	private String code;
	private String tttle;
	private CategoryQuestion category;
	private int duration;
	private Account creator;
	private Date createDate;
	
	public Exam(int examID, String code, String tttle, CategoryQuestion category, int duration, Account creator,
			Date createDate) {
		super();
		this.examID = examID;
		this.code = code;
		this.tttle = tttle;
		this.category = category;
		this.duration = duration;
		this.creator = creator;
		this.createDate = createDate;
	}

	public int getExamID() {
		return examID;
	}

	public void setExamID(int examID) {
		this.examID = examID;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTttle() {
		return tttle;
	}

	public void setTttle(String tttle) {
		this.tttle = tttle;
	}

	public CategoryQuestion getCategory() {
		return category;
	}

	public void setCategory(CategoryQuestion category) {
		this.category = category;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
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
