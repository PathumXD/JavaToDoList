/*
 * Project: Java To-Do List CLI App
 * Author: Pathum Bandara (PathumXD)
 * License: MIT License
 
 * Description:
  - A simple command-line based To-Do list application using Java.Supports viewing, adding, and removing tasks stored in a local text file. 

 * Copyright (c) 2025 PathumXD
*/

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList
{
	static String fileName = "todo.txt";

	public static void main(String[] args) throws IOException
	{
		int menuItem = -1;
		while(menuItem != 0) {
			menuItem = menu();
			switch(menuItem) {
				case 1:
					showList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					removeItem();
					break;
				case 0:
					break;
				default:
					System.out.println("Don't recognize input");

			}
		}
	}

	static int menu() {
		int choice;
		Scanner input = new Scanner(System.in);

		System.out.println("\n ##### ----------- Main Menu ----------- ##### \n");
		System.out.println("0. Exit the Program");
		System.out.println("1. Display To-Do List");
		System.out.println("2. Add Item to To-Do List");
		System.out.println("3. Remove Item from To-Do List");
		System.out.println();
		System.out.println("Enter a Choice(type Number): ");
		choice = input.nextInt();
		return choice;
	}

	static void showList() {
		System.out.println("\n ----------- To-Do List. ----------- \n");
		try{
			Scanner inFile = new Scanner(new FileReader(fileName));
			String line;
			int number = 1;
			while (inFile.hasNextLine()) {
				line = inFile.nextLine();
				System.out.print(number + " ");
				System.out.println(line);
				++number;
			}
			System.out.println();
			inFile.close();
		}
		catch (IOException ioe) {
			System.out.println("Can't access file."); 
		}
	}

	static void addItem() {
		System.out.println("\n ----------- Add Item. ----------- \n");
		try{
			Scanner input = new Scanner(System.in);
			PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
			System.out.print("Enter an item: ");
			String item = input.nextLine();
			outFile.println(item);
			outFile.close();
		}
		catch (IOException ioe) {
			System.out.println("Can't access file.");
		}
	}

	static void removeItem() {
		int choice;
		showList();
		Scanner input = new Scanner(System.in);
		System.out.print("Which item do you want to remove(type Number) ? ");
		choice = input.nextInt();
		ArrayList<String> items = new ArrayList<String>();
		int number = 1;
		try {
			Scanner inFile = new Scanner(new FileReader(fileName));
			String item;
			while (inFile.hasNextLine()) {
				item = inFile.nextLine();
				if (number != choice)
					items.add(item);
				++number;
			}
			PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
			for(int i = 0; i < items.size(); ++i)
				outFile.println(items.get(i));
			outFile.close();
		}
		catch (IOException ioe) {
			System.out.println("Can't access file.");
		}
	}


}
