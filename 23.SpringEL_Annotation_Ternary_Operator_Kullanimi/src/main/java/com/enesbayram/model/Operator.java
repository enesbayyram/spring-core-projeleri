package com.enesbayram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("operatorBean")
public class Operator {

	@Value("#{sayiBean.sayi1 gt sayiBean.sayi2 ? true : false}")
	private boolean kontrolBoolean;
	
	@Value("#{'enes'.equals('enesb') ? 'AYNI' : 'FARKLI'}")
	private String kontrolString;

	public boolean isKontrolBoolean() {
		return kontrolBoolean;
	}

	public void setKontrolBoolean(boolean kontrolBoolean) {
		this.kontrolBoolean = kontrolBoolean;
	}

	public String getKontrolString() {
		return kontrolString;
	}

	public void setKontrolString(String kontrolString) {
		this.kontrolString = kontrolString;
	}
	
	
}
