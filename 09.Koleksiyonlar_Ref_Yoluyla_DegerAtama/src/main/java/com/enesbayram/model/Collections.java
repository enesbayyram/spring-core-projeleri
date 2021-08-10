package com.enesbayram.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	List<Student> studentList;
	Set<Student> studentSet;
	Map<Integer, Student> studentMap;
	
	public Collections() {
		studentList = new ArrayList<Student>();
		studentSet = new HashSet<Student>();
		studentMap = new HashMap<Integer, Student>();
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Set<Student> getStudentSet() {
		return studentSet;
	}

	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}

	public Map<Integer, Student> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<Integer, Student> studentMap) {
		this.studentMap = studentMap;
	}
	
}
