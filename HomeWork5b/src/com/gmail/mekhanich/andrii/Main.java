package com.gmail.mekhanich.andrii;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File test = new File("M:\\My new documents\\");
		File testOne = new File("M:\\My new documents\\defaultpi_1212.txt");
		FileCompareByWords first = new FileCompareByWords(test, testOne);
		
		try {
		first.writerCSV(first.srchResult(first.ar(test), first.ar(testOne)));
		} catch (IsNotFileExeption e) {
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
