package com.lockedme.client;

import java.util.Scanner;

import com.lockedme.operations.BusinessLogicMain;

public class ClientRequirements {
	static Scanner input = new Scanner(System.in);
	static int option;

	public static void welcomeuser() {
		System.out.println(" Welcome to ------- LockedMe-App---------------\n");
		System.out.println(" Application name : LockedMe-app");
		System.out.println(" Developer Details : Develeloped by Ahemmed");
	}

	public static void menuDetails() {

		BusinessLogicMain business = new BusinessLogicMain();

		System.out.println("Please read the following Instructions:\n" + "1. Enter 1 to show the all files\n"
				+ "2. Enter 2 to add a file\n" + "3. Enter 3 to delete a file\n" + "4. Enter 4 to search a file\n"
				+ "5. Enter 5 to exit");
		System.out.println("Please Enter your Input");
		option = input.nextInt();
		switch (option) {
		case 1:
			System.out.println("You entered 1 , please wait files are laoding.......");
			business.showFiles();

			break;
		case 2:
			System.out.println("Please Enter your Input");
			data = input.nextInt();
			switch(data) {
			case 1:
				System.out.println("You have Entered 2 to add the file, please wait to file is adding... ");
				business.addFile();
				break;
			}
			
		case 3:
			System.out.println("You have Entered 3 to delete the file");
			business.deleteFile();
			break;
		case 4:
			System.out.println("Enter the file name to search");
			business.searchFile();
			break;
		case 5:
			System.out.println("You are succesfully exited");
			System.out.println("------------- Thank you ----------------------");
			break;
		default:
			System.out.println("Invalid Choice");

		}

	}
}
