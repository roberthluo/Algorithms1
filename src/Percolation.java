
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class Percolation {
	
	//true is open, false is full
	boolean [][] grid;
	
	//Create n-by-n grid, will sites blocked
	public Percolation(int n)
	{
		if(n <= 0)
		{
			throw new IllegalArgumentException();
		}
		grid = new boolean [n][n];
	}
	
	// open site (row, col) if it is not open already
	// assume row and col start at 1,1
	public void open(int row, int col)
	{
		row = row - 1;
		col = col - 1;
		if(row >= grid.length || col >= grid.length)
		{
			throw new IndexOutOfBoundsException();
		}
		if(grid[row][col] != false)
		{
			grid[row][col] = true;
		}
	}
	
	// is site (row, col) open?
	// assume row and col start at 1,1
	public boolean isOpen(int row, int col)
	{
		if(grid[row - 1][col - 1] == true)
		{
			return true;
		}
		return false;
	}

	// is site (row, col) full?
	// assume row and col start at 1,1
	public boolean isFull(int row, int col)
	{
		if(grid[row - 1][col - 1] != true)
		{
			return true;
		}
		return false;
	}
	
	// number of open site
	public int numberOfOpenSites()
	{
		int count = 0;
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				if(this.isOpen(i, j) == true)
				{
					count++;
				}
			}
		}
		return count;
		
	}
	
	// does the system percolate?
	// using probability to solve them, if site vacancy is over 0.593, it percolates
	public boolean percolates()
	{
		if(this.numberOfOpenSites()/grid.length * grid.length >= 0.593 )
		{
		return true;
		}
		
		return false;
	}
	
	// test client (optional)
	public static void main(String[] args)
	{
		Percolation percolation = new Percolation(3);
	}
	
}
