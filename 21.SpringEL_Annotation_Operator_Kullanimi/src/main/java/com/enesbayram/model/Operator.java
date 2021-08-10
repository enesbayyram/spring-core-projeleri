package com.enesbayram.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("operatorBean")
public class Operator {

	@Value("#{sayiBean.sayi1 == sayiBean.sayi2}")
	private boolean equals;
	
	@Value("#{sayiBean.sayi1 != sayiBean.sayi2}")
	private boolean notEquals;
	
	@Value("#{sayiBean.sayi1 lt sayiBean.sayi2}")
	private boolean lessThan;
	
	@Value("#{sayiBean.sayi1 > sayiBean.sayi2}")
	private boolean greaterThan;
	
	@Value("#{sayiBean.sayi1 le sayiBean.sayi2}")
	private boolean lessOrEquals;
	
	@Value("#{sayiBean.sayi1 ge sayiBean.sayi2}")
	private boolean greaterOrEquals;
	
	@Value("#{sayiBean.sayi1 lt 11 and sayiBean.sayi2 ==5}")
	private boolean and;
	
	@Value("#{sayiBean.sayi1 == 5 or sayiBean.sayi1 >9}")
	private boolean or;
	
	@Value("#{!(sayiBean.sayi1 != sayiBean.sayi2)}")
	private boolean not;
	
	@Value("#{sayiBean.sayi1 + sayiBean.sayi2}")
	private int plus;
	
	@Value("#{sayiBean.sayi1 - sayiBean.sayi2}")
	private int minus;
	
	@Value("#{sayiBean.sayi1 * sayiBean.sayi2}")
	private int multiple;
	
	@Value("#{sayiBean.sayi1 / sayiBean.sayi2}")
	private int dividedBy;
	
	
	public boolean isEquals() {
		return equals;
	}
	public void setEquals(boolean equals) {
		this.equals = equals;
	}
	public boolean isNotEquals() {
		return notEquals;
	}
	public void setNotEquals(boolean notEquals) {
		this.notEquals = notEquals;
	}
	public boolean isLessThan() {
		return lessThan;
	}
	public void setLessThan(boolean lessThan) {
		this.lessThan = lessThan;
	}
	public boolean isGreaterThan() {
		return greaterThan;
	}
	public void setGreaterThan(boolean greaterThan) {
		this.greaterThan = greaterThan;
	}
	public boolean isLessOrEquals() {
		return lessOrEquals;
	}
	public void setLessOrEquals(boolean lessOrEquals) {
		this.lessOrEquals = lessOrEquals;
	}
	public boolean isGreaterOrEquals() {
		return greaterOrEquals;
	}
	public void setGreaterOrEquals(boolean greaterOrEquals) {
		this.greaterOrEquals = greaterOrEquals;
	}
	public boolean isAnd() {
		return and;
	}
	public void setAnd(boolean and) {
		this.and = and;
	}
	public boolean isOr() {
		return or;
	}
	public void setOr(boolean or) {
		this.or = or;
	}
	public boolean isNot() {
		return not;
	}
	public void setNot(boolean not) {
		this.not = not;
	}
	public int getPlus() {
		return plus;
	}
	public void setPlus(int plus) {
		this.plus = plus;
	}
	public int getMinus() {
		return minus;
	}
	public void setMinus(int minus) {
		this.minus = minus;
	}
	public int getMultiple() {
		return multiple;
	}
	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}
	public int getDividedBy() {
		return dividedBy;
	}
	public void setDividedBy(int dividedBy) {
		this.dividedBy = dividedBy;
	}
}
