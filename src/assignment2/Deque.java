package assignment2;
import java.util.Iterator;

import javax.xml.soap.Node;

public class Deque<Item> implements Iterable<Item> {
	
	private Node head;
	private Node tail;
	private int size;

	//Private Class Node
	private class Node
	{
		Item item;
		Node next;
		Node previous;
	}
	
	
	// construct an empty deque
	public Deque()
	{
		this.head = null;
		this.size = 0;
	}
	
	// is the deque empty?
	public boolean isEmpty()
	{
		if(this.size == 0)
		{
			return true;
		}
		return false;
		
	}
	
	// return the number of items on the deque
	public int size()
	{
		return size;
	}
	
	// add the item to the front
	public void addFirst(Item item)
	{
		this.size++;
		this.head.previous.item = item;
		this.head.previous = this.head;
	}
	
	// add the item to the end
	public void AddLast(Item item)
	{
		this.size++;
		this.tail.next.item = item;
		this.tail.next = this.tail;
	}
	
	// remove and return the item from the front
	public Item removeFirst()
	{
		Item removedItem = this.head.item;
		this.head = this.head.next;
		this.size --;
		
		return removedItem;
	}
	
	// remove and return the item from the end
	public Item removeLast()
	{
		Item removedItem = this.tail.item;
		this.tail = this.tail.previous;
		this.size --;
		
		return removedItem;
	}
	
	// return an Iterator over items in order from front to end
	public Iterator<Item> iterator()
	{
		return new DequeIterator();
	}
	
	private class DequeIterator implements Iterator<Item>
	{
		private Node current = head;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current.next.item == null;
		}
		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return current.next.item;
		}
		
	}


}

