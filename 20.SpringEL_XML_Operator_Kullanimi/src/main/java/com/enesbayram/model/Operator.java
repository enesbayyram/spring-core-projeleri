package com.enesbayram.model;

public class Operator {

	private boolean equals;
	private boolean notEquals;
	private boolean lessThan;
	private boolean greaterThan;
	private boolean lessOrEquals;
	private boolean greaterOrEquals;
	
	private boolean and;
	private boolean or;
	private boolean not;
	
	private int plus;
	private int minus;
	private int multiple;
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
