package com.spring.connection;

public class Student {

	private int sid;
	private String sname;
	private Subject sub;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sub=" + sub + "]";
	}
	public Student(int sid, String sname, Subject sub) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sub = sub;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
class Subject{
	private String option;
	private String complsry;
	
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getComplsry() {
		return complsry;
	}
	public void setComplsry(String complsry) {
		this.complsry = complsry;
	}
	@Override
	public String toString() {
		return "Subject [option=" + option + ", complsry=" + complsry + "]";
	}
	public Subject(String option, String complsry) {
		super();
		this.option = option;
		this.complsry = complsry;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
}