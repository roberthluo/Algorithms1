package assignment2;

import java.util.Iterator;


public class RandomizedQueue<Item> implements Iterable<Item> {
	
	//Private Class Node
	private class Node
	{
		Item item;
		Node next;
		Node previous;
	}
	
	
	public RandomizedQueue()
	{
		
	}
	
	public boolean IsEmpty()
	{
		return true;
	}
	
	public int Size()
	{
		return 0;
	}
	
	public void Enqueue(Item item)
	{
		
	}
	
	public Item Dequeue()
	{
		return null;
	}
	
	public Item Sample()
	{
		return null;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
