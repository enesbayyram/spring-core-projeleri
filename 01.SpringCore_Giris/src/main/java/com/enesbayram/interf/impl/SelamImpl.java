package com.enesbayram.interf.impl;

import com.enesbayram.interf.ISelam;

public class SelamImpl implements ISelam{

	@Override
	public void mesajYaz(String mesaj) {
		System.out.println(mesaj);
	}

}
