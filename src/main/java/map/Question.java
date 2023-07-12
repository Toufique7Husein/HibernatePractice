package map;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {
	
	@Id
	@Column(name="question_id")
	private int QuestionId;
	private String question;

	@OneToMany
	private List<Answer> answers;



	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question(int questionId) {
		super();
		QuestionId = questionId;
	}
	public int getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}
	
	public Question(int questionId, String question) {
		super();
		QuestionId = questionId;
		this.question = question;
	}

	public String toString() {
		return "Question [QuestionId=" + QuestionId + "]";
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}
