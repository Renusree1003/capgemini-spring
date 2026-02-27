package com.capgemini.springbootbasic;

public class Student {
	String sname;
	String branch;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student(String sname, String branch) {
		super();
		this.sname = sname;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", branch=" + branch + "]";
	}
	

}
