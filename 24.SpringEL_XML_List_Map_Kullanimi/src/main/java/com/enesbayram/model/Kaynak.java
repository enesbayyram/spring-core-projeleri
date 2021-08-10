package com.enesbayram.model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kaynak {

	private Map<Integer, String> map;
	private List<String> list;
	
	public Kaynak() {
		map = new HashMap<Integer, String>();
		
		map.put(1, "Enes Bayram");
		map.put(2, "Yasin Yazıcı");
		map.put(3, "Bilal Çamur");
		map.put(4, "Uğur Bayram");
		map.put(5, "Yakup Reçber");
		
		list = new ArrayList<String>();
		list.add("Berk Savaç");
		list.add("Taner Pala");
		list.add("Berkay Baloğlu");
		list.add("Ulaş Uluşan");
		
		
		
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
}
