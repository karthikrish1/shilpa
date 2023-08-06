package Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class reading {
public static void main(String[] args) throws IOException {

	/*
	 * File            : reach the path    :   pass filepath as input 
	 * FileReader      : fetch  a file     :   pass file object as input
	 * BufferedReader  : read              :   pass filereader object as input
	 * 
	 * nonstatic method 
	 * 
	 * */
	
	File f= new File("C:\\Users\\hp\\eclipse-workspace\\cibi\\src\\Filehandling\\cibi.txt");
	FileReader fw= new FileReader(f);
	BufferedReader bw= new BufferedReader(fw);
	String line;
	while((line=bw.readLine())!=null)
	{
		System.out.println(line);
	}
	/*
	 * first; br.readline reads first line   line=hi priya  line!=null   print line 
	 * second br.readline reads secone line  line=shree     line!=null   print shree
	 * third  br,readline reads third line   line=bye       line!=null   print bye
	 * fourth                                line=null      null!=null   terminate 
	 * 
	 * 
	 * 
	 * */
}
}
