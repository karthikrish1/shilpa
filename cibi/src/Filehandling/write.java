package Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write {

	public static void main(String[] args) throws IOException {
		
		/*
		 * File            : reach the path    :   pass filepath as input 
		 * FileWriter      : create a file     :   pass file object as input
		 * BufferedWriter  : write into it     :   pass filewriter object as input
		 * 
		 * nonstatic method 
		 * 
		 * */
		
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\cibi\\src\\Filehandling\\cibi.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("hi priya");
		bw.newLine();
		bw.write("shree");
		bw.newLine();
		bw.write("bye");
		bw.close();
	}
}
