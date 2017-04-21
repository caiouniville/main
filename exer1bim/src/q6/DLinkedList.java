package q6;

public class DLinkedList<T> {

	private DNode<T> first;

	private DNode<T> last;

	private long size = 0;
	
	public long getSize() {
		return size;
	}
	
	public void removeFirst() {
		if(!isEmpty()) {
			first = first.getNext();
			size--;
			if(isEmpty()) {
				last = null;
			}
		}
	}
	
	public void addFirst(DNode<T> dnode) {
		if (isEmpty()) {
			first = dnode;
			last = dnode;
		} else {
			first.setPrev(dnode);
			dnode.setNext(first);
			first = dnode;
		}
		size++;
	}
	
	public void addLast(DNode<T> dnode) {
		if (isEmpty()) {
			first = dnode;
			last = dnode;
		} else {
			last.setNext(dnode);
			dnode.setPrev(last);
			last = dnode;
		}
		size++;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public DNode<T> getFirst() {
		return first;
	}

	public DNode<T> getLast() {
		return last;
	}

}
