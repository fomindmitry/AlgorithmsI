
public class RandomizedQueue<Item> implements Iterable<Item> {
	private Item[] items;    
	private int size = 0;   

	public RandomizedQueue() {
		items = (Item[]) new Object[2];
	}

	public boolean isEmpty(){
		return size == 0;     
	}

	public int size(){
		return size;
	}

	private void resize(int max) {
		assert max >= size;
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0; i < size; i++) {
			temp[i] = items[i];
		}
		items = temp;
	}

	public void enqueue(Item item) {
		if (item == null){
			throw new java.lang.NullPointerException();
		}
		if (size == items.length) resize(2*items.length); 
		items[size] = item;                          
		size++;
	}

	public Item dequeue() {
		if (isEmpty()) throw new java.util.NoSuchElementException();
		int index = StdRandom.uniform(size);
		Item item = items[index];
		if (index != size-1){
			items[index] = items[size-1];
		}
		items[size-1] = null;                         
		size--;

		if (size > 0 && size == items.length/4) resize(items.length/2);
		return item;
	}

	public Item sample(){
		if (isEmpty()) throw new java.util.NoSuchElementException();
		int index = (StdRandom.uniform(size));
		return items[index];
	}

	public java.util.Iterator<Item> iterator() { return new ArrayIterator(); }

	private class ArrayIterator implements java.util.Iterator<Item> {
		private Item[] ititems = (Item[]) new Object[items.length];

		private int itsize = size;
		public boolean hasNext()   { return itsize != 0;                               }
		public void remove()        { throw new UnsupportedOperationException();   }

		public ArrayIterator(){
			for (int j=0; j<items.length; j++){
				ititems[j] = items[j];
			}
		}

		public Item next() {
			if (!hasNext()) throw new java.util.NoSuchElementException();
			int index = (StdRandom.uniform(itsize));
			Item item = ititems[index];
			if (index != itsize-1){
				ititems[index] = ititems[itsize-1];
			}
			ititems[itsize-1] = null;                            
			itsize--;
			return item;
		}
	}

	public static void main(String[] args) {
		RandomizedQueue<String> q = new RandomizedQueue<String>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) q.enqueue(item);
			else if (!q.isEmpty()) StdOut.print(q.dequeue() + " ");
		}
		StdOut.println("(" + q.size() + " left on queue)");
	}
}