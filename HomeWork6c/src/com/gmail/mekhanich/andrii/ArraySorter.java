package com.gmail.mekhanich.andrii;

import java.util.Arrays;

public class ArraySorter {

	private int[] arr;
	private int startPoint;
	private int stopPoint;

	public ArraySorter() {
		super();
	}

	public ArraySorter(int[] arr, int startPoint, int stopPoint) {
		super();
		this.arr = arr;
		this.startPoint = startPoint;
		this.stopPoint = stopPoint;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}

	public int getStopPoint() {
		return stopPoint;
	}

	public void setStopPoint(int stopPoint) {
		this.stopPoint = stopPoint;
	}

	public static int[] arraySorter(int[] array, int startPoint, int stopPoint) {
		Thread a = Thread.currentThread();
		int d = (stopPoint - startPoint) / 2;
		while (d > 0) {
			for (int i = d; i < stopPoint; i += 1) {
				for (int j = i; j >= d && array[j] < array[j - d]; j -= d) {
					int temp = array[j];
					array[j] = array[j - d];
					array[j - d] = temp;
				}
				//System.out.println(Arrays.toString(array) + " d= " + d + " " +a.getName());
			}
			d = d / 2;
		}

		return array;
	}

}
