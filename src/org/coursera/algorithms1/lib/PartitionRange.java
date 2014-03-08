package org.coursera.algorithms1.lib;

public class PartitionRange {
	private int hi;
	public void setHi(int hi) {
		this.hi = hi;
	}


	public void setLo(int lo) {
		this.lo = lo;
	}


	public int getHi() {
		return hi;
	}


	public int getLo() {
		return lo;
	}


	private int lo;
	
	
	public PartitionRange(int hi, int lo) {
		super();
		this.hi = hi;
		this.lo = lo;
	}
			
}