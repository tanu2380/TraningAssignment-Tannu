package com.tannu.exception;

public class NameInput {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name)throws NameException {
        String name1 = "Tufel";
		if(name.equals(name1)) 
			throw new NameException("Name Already Exsist");
			this.name = name;

		
		
		
	}
	
	
}