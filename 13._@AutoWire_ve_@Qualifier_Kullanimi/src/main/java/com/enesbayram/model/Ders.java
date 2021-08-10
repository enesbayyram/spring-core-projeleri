package com.enesbayram.model;

public class Ders {
	
	private String ders;
	
	private Integer not;
	
	public Ders() {

	}

	public Ders(String ders, Integer not) {
		this.ders = ders;
		this.not = not;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

	public Integer getNot() {
		return not;
	}

	public void setNot(Integer not) {
		this.not = not;
	}
}
