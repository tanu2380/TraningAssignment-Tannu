package com.tannu.bean;

public class Element {
	private int atomicWeight;
	private String name;
	private String sybmol;
	
	public Element() {
		
	}

	

	public Element(int atomicWeight, String name, String sybmol) {
		super();
		this.atomicWeight = atomicWeight;
		this.name = name;
		this.sybmol = sybmol;
	}



	

	public int getAtomicWeight() {
		return atomicWeight;
	}



	public void setAtomicWeight(int atomicWeight) {
		this.atomicWeight = atomicWeight;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSybmol() {
		return sybmol;
	}



	public void setSybmol(String sybmol) {
		this.sybmol = sybmol;
	}



	@Override
	public String toString() {
		return "Element [atomicWeight=" + atomicWeight + ", name=" + name + ", sybmol=" + sybmol + "]";
	}



	
	
	

}
