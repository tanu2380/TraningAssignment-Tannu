package com.tannu.client;

import java.util.Scanner;

import com.tannu.presentation.ElementPresentation;
import com.tannu.presentation.ElementPresentationImpl;

public class Client {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ElementPresentation elePresentation=new ElementPresentationImpl();
		while(true) {
			elePresentation.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			elePresentation.performMenu(choice);
		}
		

	}

}
