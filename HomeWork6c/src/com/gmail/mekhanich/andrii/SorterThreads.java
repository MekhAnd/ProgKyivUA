package com.gmail.mekhanich.andrii;

public class SorterThreads implements Runnable {
	private int [] ar;
	private int minBound;
	private int maxBound;
	
	
	public SorterThreads(int[] ar, int minBound, int maxBound) {
		super();
		this.ar = ar;
		this.minBound = minBound;
		this.maxBound = maxBound;
	}


	public SorterThreads() {
		super();
	}


	@Override
	public void run() {
		ArraySorter.arraySorter(ar, minBound, maxBound);
		
	}

	
}
