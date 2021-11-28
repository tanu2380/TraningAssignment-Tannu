package com.tannu.exception;
import java.util.Scanner;

public class EmpAge {
	public static void main(String[] args) {
		AgeInput ageInput=new AgeInput();
		NameInput nameInput = new NameInput();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employees Name & Age :");
		try {
			nameInput.setName(sc.next());
			ageInput.setAge(sc.nextInt());
			System.out.println("Entered Name : "+nameInput.getName());
			System.out.println("Entered age : "+ageInput.getAge());
		} catch (AgeException e) {
			System.out.println("Invalid Age");
		}
		catch (NameException a) {
			System.out.println("Name Already Exist");
		}
	}
}
