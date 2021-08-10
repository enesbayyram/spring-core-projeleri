package com.enesbayram.model;

import java.util.HashMap;
import java.util.Map;

public class Koleksiyon {

	private Map<String, String> map;
	private String pattern;
	
	public Koleksiyon() {
		map = new HashMap<String, String>();
		map.put("Enes Bayram", "enesbayramgmail.com");
		pattern="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
}
