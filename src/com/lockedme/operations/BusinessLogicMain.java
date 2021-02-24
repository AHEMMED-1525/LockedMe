package com.lockedme.operations;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusinessLogicMain implements OperationFilesInterface {
	Scanner input = new Scanner(System.in);
	List<String> load = new ArrayList<String>();
	
	File[] files = new File("C:\\Users\\AHEMMED\\SimpliLearn_FSD_Projects\\FSD_PROJECTS\\FSD_PHASE1_PROJECT").listFiles();
	
	@Override
	public void showFiles() {
		for(File file:files) {
			if(file.isFile()) {
				load.add(file.getName());
			}
			load.forEach(System.out::print);
		}
		


	}

	@Override
	public void addFile() {
		  System.out.println("Please Enter the file which you want to add :");
		  String fileName = input.next();
		  File f = new File(fileName);
		  try {
			  if(f.createNewFile()) {
				  System.out.println(fileName+" File is created ");
				  Desktop.getDesktop().edit(f);
			  }
			  else {
				  System.out.println("File is already Exists");
			  }
		  } catch (IOException e) { e.printStackTrace(); }
		 
	}

	@Override
	public void deleteFile() {
		 System.out.println("Please Enter the file which you want to add :");
		  String fileName = input.next();
		  File f = new File(fileName);
		  if(f.delete()) {
			  System.out.println("File is deleted Succesfully ");
		  }
		  else {
			  System.out.println("No Such file is present to delete");
		  }
		  
		 
	}

	@Override
	public void searchFile() {
		try {	
			
			File directory = new File("C:\\Users\\AHEMMED\\SimpliLearn_FSD_Projects\\FSD_PROJECTS\\FSD_PHASE1_PROJECT");
			System.out.println("Enter the file name which you want to search:");
			String fileName=input.nextLine();
			
			
			 
        	
		}catch(Exception ex) {
			System.out.println("file not found");
		}
				  
		  
		
		 
	}

}
