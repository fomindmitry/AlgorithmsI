

public class WeightedQuickUnionUF
 {
	private int[] id;
	private int[] sz;

	public WeightedQuickUnionUF(int N) {
		id = new int[N];
		sz = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}

	private int root(int i) {
		while (i != id[i])
			i = id[i];
		return i;
	}

	public boolean connected(int p, int q) {
		System.out.println("connected("+p+","+q+")");
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		if (i == j) return;
		if (sz[i] < sz[j]) {
			System.out.println("changing id["+i+"]");
			id[i] = j; sz[j] += sz[i]; 
		}
		else {
			System.out.println("changing id["+j+"]");
			id[j] = i; sz[i] += sz[j]; 
		}
		
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
			int len=0;
			sb.append("\nrib "+(++ribcount)+":");
			int ribstart = i;
			sb.append(""+ribstart);
			while(ribstart!=id[ribstart]) {
				sb.append("->"+id[ribstart]);
				ribstart=id[ribstart];		
			}
			if(len>maxlen)len=maxlen;
		}			
		
		sb.append("maxlen="+maxlen);
		return sb.toString();
		
	}
}