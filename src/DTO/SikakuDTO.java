package DTO;

import java.util.Date;

public class SikakuDTO {
	private int studentId;
	private String studentName;
	private int studentAge;
	private String studentGender;
	private int sikakuId;
	private String sikakuName;
	private String ExamDate;
	private String Sof;

	public SikakuDTO(int studentId, String studentName, int studentAge, String studentGender, int sikakuId, String sikakuName, String sikakuLevel, String Sof, Date examDate){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentGender = studentGender;

	}
	public SikakuDTO(int sikakuId, String sikakuName, String ExamDate, String Sof){
		this.sikakuId = sikakuId;
		this.sikakuName = sikakuName;
		this.ExamDate = ExamDate;
		this.Sof = Sof;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public int getSikakuId() {
		return sikakuId;
	}
	public void setSikakuId(int sikakuId) {
		this.sikakuId = sikakuId;
	}
	public String getSikakuName() {
		return sikakuName;
	}
	public void setSikakuName(String sikakuName) {
		this.sikakuName = sikakuName;
	}

	public String getSof() {
		return Sof;
	}
	public void setSof(String Sof) {
		this.Sof = Sof;
	}

	public String getExamDate() {
		return ExamDate;
	}

	public void setExamDate(String ExamDate) {
		this.ExamDate = ExamDate;
	}


}
