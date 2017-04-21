package q3;

public class SLinkedList<T> {

	private static final int T = 0;

	private Node<T> first;

	private Node<T> last;

	private long size = 0;

	public long getSize() {
		return size;
	}

	public void removeFirst() {
		if (!isEmpty()) {
			first = first.getNext();
			size--;
			if (isEmpty()) {
				last = null;
			}
		}
	}

	public void add(Node<T> node) {
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
		}
		size++;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}


	public int getNodeDeep(Node <T> node){
		int result = 0;
		boolean found = false;
		
		Node<T> aux = this.getFirst();
		
		while (aux != null){
			
			if(aux.equals(node)){
				return result;
			}
			result++;
			
			aux = aux.getNext();
		}
		return result;
	}
}

