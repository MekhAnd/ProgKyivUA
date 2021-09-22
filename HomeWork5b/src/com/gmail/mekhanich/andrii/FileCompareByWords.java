package com.gmail.mekhanich.andrii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class FileCompareByWords {
	
	private File a;
	private File b;
	
	public FileCompareByWords(File a, File b) {
		super();
		this.a = a;
		this.b = b;
	}
	

	public FileCompareByWords() {
		super();
	}


	public File getA() {
		return a;
	}

	public void setA(File a) {
		this.a = a;
	}

	public File getB() {
		return b;
	}

	public void setB(File b) {
		this.b = b;
	}
	
	public boolean chkr (File file) {
		boolean status = false;
		if (file.isFile()) {
			status = true;
		}
		return status;
	}
	
	public String [] ar (File file) {
		String text ="";
		String result = "";
			try (BufferedReader br = new BufferedReader(new FileReader(file));) {
				for (;(text = br.readLine())!=null;) {
					result += text;
					result += " ";
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		String [] ar = result.split(" ");
		return ar;
	}
	
	public String srchResult (String [] a, String [] b) {
		String result = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i].equals(b[j])) {
					result += a[i]+ ";";
					break;
				}
			}
		}
		return result;
	}
	
	public void writerCSV (String a) {
		File result = new File(".");
		try (PrintWriter pw = new PrintWriter("result.csv")) {
			pw.print(a);
			System.out.println("Have done!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
