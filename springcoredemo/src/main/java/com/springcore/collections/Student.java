package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	private String studentName;
	private List<String>Subjects;
	private Set<String> address;
	private Map<String,Integer>subjectMarks;
	private Properties props;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, List<String> subjects, Set<String> address, Map<String, Integer> subjectMarks,
			Properties props) {
		super();
		this.studentName = studentName;
		Subjects = subjects;
		this.address = address;
		this.subjectMarks = subjectMarks;
		this.props = props;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getSubjects() {
		return Subjects;
	}
	public void setSubjects(List<String> subjects) {
		Subjects = subjects;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, Integer> getSubjectMarks() {
		return subjectMarks;
	}
	public void setSubjectMarks(Map<String, Integer> subjectMarks) {
		this.subjectMarks = subjectMarks;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", Subjects=" + Subjects + ", address=" + address
				+ ", subjectMarks=" + subjectMarks + ", props=" + props + "]";
	}
	
	
	
	

}
