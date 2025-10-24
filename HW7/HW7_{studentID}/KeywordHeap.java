import java.util.PriorityQueue;

public class KeywordHeap {
	private PriorityQueue<Keyword> heap;

	public KeywordHeap() {
		this.heap = new PriorityQueue<Keyword>(10, new KeywordComparator());
	}

	public void add(Keyword k) {
		// YOUR TURN
		// 2. add element into the heap
	}

	public void peek() {
		// YOUR TURN
		// 3. Define peek
	}

	public void removeMin() {
		// YOUR TURN
		// 4. remove minimal element and print it

	}

	public void output() {
		// YOUR TURN
		// 5. print the output in order and remove all element
	}
}
