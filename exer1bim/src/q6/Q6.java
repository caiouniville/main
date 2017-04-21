package q6;

public class Q6 {
	
	public static DLinkedList<String> invert (DLinkedList<String> list){
		
		DLinkedList<String> result = new DLinkedList<>();
		
		DNode<String> aux = list.getFirst();
		while( aux != null){
			DNode<String> node = new DNode<String>(aux.getValue());
			result.addFirst(node);
			aux = aux.getNext();
		}
	}

}
