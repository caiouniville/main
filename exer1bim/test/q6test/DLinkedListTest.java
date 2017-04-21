package q6test;

import org.junit.Assert;
import org.junit.Test;

public class DLinkedListTest {

	@Test
	public void addFirstTest() {
		DLinkedList<String> linkedList = new DLinkedList<>();
		Assert.assertTrue(linkedList.getSize() == 0);
		Assert.assertTrue(linkedList.isEmpty());
		
		 DNode<String> nodeA = new DNode<>("A");
		DNode<String> nodeB = new DNode<>("B");
		DNode<String> nodeC = new DNode<>("C");

		linkedList.addFirst(nodeA);
		linkedList.addFirst(nodeB);
		linkedList.addFirst(nodeC);

		Assert.assertEquals(linkedList.getFirst(), nodeC);
		Assert.assertEquals(linkedList.getLast(), nodeA);
		
		Assert.assertTrue(linkedList.getSize() == 3);
		Assert.assertFalse(linkedList.isEmpty());
	}
	

	
	
}
