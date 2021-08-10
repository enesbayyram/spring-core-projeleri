package com.enesbayram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("regexControllerBean")
public class RegexController {
	
	@Value("#{(koleksiyonBean.map.get('Enes Bayram') matches koleksiyonBean.pattern)==true ? 'UYGUN' :'UYGUN DEĞİL'}")
	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	

}
