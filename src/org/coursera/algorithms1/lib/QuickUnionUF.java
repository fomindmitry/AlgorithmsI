package org.coursera.algorithms1.lib;

public class QuickUnionUF
 {
	private int[] id;

	public QuickUnionUF(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i;
	}
	
	public QuickUnionUF(int [] array) {
		id = array;
	}
	

	private int root(int i) {
		while (i != id[i])
			i = id[i];
		return i;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
	
	
	public String toString() {
		StringBuilder sb =  new StringBuilder();
		sb.append("id=");
		for (int curid : id ) {
			sb.append(curid);
			sb.append(" ");
		}
		int ribcount=0;
		int maxlen=0;
		for(int i=0;i<id.length;i++) {
			int len=1;
			sb.append("\nrib "+(++ribcount)+":");
			int ribstart = i;
			sb.append(""+ribstart);
			while(ribstart!=id[ribstart]) {
				len++;
				sb.append("->"+id[ribstart]);
				ribstart=id[ribstart];				
			}
			if(len>maxlen)maxlen=len;
		}			
		
		sb.append("maxlen="+maxlen);
		return sb.toString();
		
	}	
	
}