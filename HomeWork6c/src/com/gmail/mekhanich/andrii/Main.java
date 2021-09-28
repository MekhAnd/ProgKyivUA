package com.gmail.mekhanich.andrii;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int length = 40;
		int threads = 4;
		
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));
		
		Thread [] a = new Thread[threads];
		for (int i = 0; i < a.length; i += 1) {
			int startPoint = (length / threads) * i;
			int stopPoint = (length / threads) * (i + 1);
			if (length % threads != 0 && i == (threads - 1)) {
				stopPoint = stopPoint + length % threads;
			}
			a[i] = new Thread(new SorterThreads(arr, startPoint, stopPoint));
		}
		
		for (int i = 0; i < a.length; i++) {
			a[i].start();
		}
		
		for (int i = 0; i < a.length; i++) {
			try {
				a[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
	
}
