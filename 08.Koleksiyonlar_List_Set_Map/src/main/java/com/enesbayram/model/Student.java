package com.enesbayram.model;
import java.util.*;

public class Student {

	List<String> studentList;
	Set<String> studentSet;
	Map<Integer, String> studentMap;
	
	public Student() {
		studentList = new ArrayList<String>();
		studentSet = new HashSet<String>();
		studentMap = new HashMap<Integer, String>();
	}

	public List<String> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<String> studentList) {
		this.studentList = studentList;
	}

	public Set<String> getStudentSet() {
		return studentSet;
	}

	public void setStudentSet(Set<String> studentSet) {
		this.studentSet = studentSet;
	}

	public Map<Integer, String> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<Integer, String> studentMap) {
		this.studentMap = studentMap;
	}
	

}
