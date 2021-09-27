package com.gmail.mekhanich.andrii;

import java.util.Arrays;

class ArraySumThread implements Runnable {

	private int startPoint;
	private int stopPoint;
	private int [] arLength;
	private static long res = 0;


	public ArraySumThread() {
		super();
	}

	public ArraySumThread(int startPoint, int stopPoint, int [] arLength) {
		super();
		this.startPoint = startPoint;
		this.stopPoint = stopPoint;
		this.arLength = arLength;
	}
	
	
	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}

	public static long getRes() {
		return res;
	}

	public void setRes(long res) {
		this.res = res;
	}

	public void setStopPoint(int stopPoint) {
		this.stopPoint = stopPoint;
	}

	public void setArLength(int [] arLength) {
		this.arLength = arLength;
	}
	
	public int getStartPoint() {
		return startPoint;
	}

	public int getStopPoint() {
		return stopPoint;
	}

	public int[] getArLength() {
		return arLength;
	}
	
	
	@Override
	public String toString() {
		return "ArraySumThread [startPoint=" + startPoint + ", stopPoint=" + stopPoint + ", arLength=" + arLength + "]";
	}
	
//	public static int[] arrayBuild(int arrlength) {
//		int[] arr = new int[arrlength];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 10);
//		}
//		System.out.println(Arrays.toString(arr));
//		return arr;
//
//	}
	
	
	
	public long arraySum(int startPoint, int stopPoint, int[] arr) {
		Thread a1 = Thread.currentThread();
		long sum = 0;
		for (int i = startPoint; i < stopPoint; i += 1) {
			sum += arr[i];
		}
		//System.out.println(sum);
		return sum;
	}
	
	public long getResult () {
		this.res = res + arraySum(startPoint, stopPoint, arLength);
		//System.out.println(res);
		return res;
	}
	
	@Override
	public void run() {
		getResult();
		
	}

}
