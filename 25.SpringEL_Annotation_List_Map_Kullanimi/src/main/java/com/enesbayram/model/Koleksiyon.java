package com.enesbayram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("koleksiyonBean")
public class Koleksiyon {

	@Value("#{kaynakBean.list[3]}")
	private String secilenList;
	
	@Value("#{kaynakBean.map.get(4)}")
	private String secilenMap;
	

	public String getSecilenList() {
		return secilenList;
	}

	public void setSecilenList(String secilenList) {
		this.secilenList = secilenList;
	}

	public String getSecilenMap() {
		return secilenMap;
	}

	public void setSecilenMap(String secilenMap) {
		this.secilenMap = secilenMap;
	}
}
