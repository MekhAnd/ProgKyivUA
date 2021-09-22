package com.gmail.mekhanich.andrii;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File test = new File("M:\\My new documents\\default_1.txt");
		File testOne = new File("M:\\My new documents\\defaultpi_1212.txt");
		FileCompareByWords first = new FileCompareByWords(test, testOne);
		first.writerCSV(first.srchResult(first.ar(test), first.ar(testOne)));
		
		

	}

}
