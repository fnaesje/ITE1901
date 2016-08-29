public class Counter {
	int count;
	
	public Counter() {
		count = 0;
	}
	public Counter(int seed) {
		count = seed;
	}

	public int increment() {
		if (count < Integer.MAX_VALUE)
		  count += 1;
		return count;
		
	}

	public int decrement() {
		return count -= 1;
	}

	public int getCount() {
		return count;
	}
}
