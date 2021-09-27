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
	
	public long arraySum(int startPoint, int stopPoint, int[] arr) {
		long sum = 0;
		for (int i = startPoint; i < stopPoint; i += 1) {
			sum += arr[i];
		}
		//System.out.println(sum);
		return sum;
	}
	
	public long getResult () {
		this.res += arraySum(startPoint, stopPoint, arLength);
		System.out.println(res + " результат добавлен");
		return res;
	}
	
	@Override
	public void run() {
		getResult();
		
	}

}
