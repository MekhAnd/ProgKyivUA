package com.gmail.mekhanich.andrii;

import java.text.SimpleDateFormat;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {

		int length = 100;
		long sum = 0;
		long sumBase = 0;
		int threads = 4;

		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));

		long startTimer1 = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i += 1) {
			sumBase += arr[i];
		}
		System.out.println(sumBase);
		
		long stopTimer1 = System.currentTimeMillis();
		long timerRes1 = stopTimer1 - startTimer1;

		
		Thread[] arTh = new Thread[threads];
		for (int i = 0; i < arTh.length; i += 1) {
			int startPoint = (length / threads) * i;
			int stopPoint = (length / threads) * (i + 1);
			if (length % threads != 0 && i == (threads - 1)) {
				stopPoint = stopPoint + length % threads;
			}
			arTh[i] = new Thread(new ArraySumThread(startPoint, stopPoint, arr));
		}
		
		
		long startTimer2 = System.currentTimeMillis();
		for (int i = 0; i < arTh.length; i += 1) {
			arTh[i].start();
		}

		for (int i = 0; i < arTh.length; i += 1) {
			try {
				arTh[i].join();
				} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		sum = sum + ArraySumThread.getRes();
		System.out.println(sum);
		
		long stopTimer2 = System.currentTimeMillis();
		long timerRes2 = stopTimer2 - startTimer2;
		
		System.out.println("Array length " + length + " threads -" + threads +  ".\nUsual culculating res ="+ timerRes1 + "  VS  culculating with multi threads =" + timerRes2);
		
	}

}
