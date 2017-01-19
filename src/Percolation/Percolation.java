package Percolation;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class Percolation {
	
	boolean [][] grid;
	
	//Create n-by-n grid, will sites blocked
	public Percolation(int n)
	{
		grid = new boolean [n][n];
	}
	
	// open site (row, col) if it is not open already
	public void open(int row, int col)
	{
		
	}
	
	// is site (row, col) open?
	public boolean isOpen(int row, int col)
	{
		return true;
	}

	// is site (row, col) full?
	public boolean isFull(int row, int col)
	{
		return true;
	}
	
	// number of open site
	public int numberOfOpenSites()
	{
		
		return 1;
	}
	
	// does the system percolate?
	public boolean percolates()
	{
		
		return true;
	}
	
	// test client (optional)
	public static void main(String[] args)
	{
		
	}
	
}
