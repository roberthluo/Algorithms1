
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class PercolationStats {

	Percolation [] percolationArray; 
	int trials;
	int gridSize;
	
	// perform trials independent experiments on an n-by-n grid
	public PercolationStats(int n, int trials)
	{
		
		if(n <= 0 || trials <= 0)
		{
			throw new IllegalArgumentException();
		}
		
		this.gridSize = n * n;
		this.trials = trials;
		percolationArray = new Percolation[trials];
		
		for(int i = 0; i < trials; i++)
		{
			percolationArray[i] = new Percolation(n);
		}
		
	}
	
	// sample mean of percolation threshold
	public double mean()
	{
		double mean = 0;
		double sum = 0;
		for(Percolation percolation : this.percolationArray)
		{
			double meanPerPercolationGrid = percolation.numberOfOpenSites()/this.gridSize;
			sum = mean + sum;
		}
		
		mean = sum/trials;
		return mean;
	}
	
	// sample standard deviation of percolation threshold
	public double stddev()
	{
		double s = 0;
		double difference = 0;
		for(Percolation percolation : this.percolationArray)
		{
			double meanPerPercolationGrid = percolation.numberOfOpenSites()/this.gridSize;
			difference = meanPerPercolationGrid - mean();
			s = difference + s;
		}
		
		s = s/(this.trials - 1);
		return s;
	}
	
	// low  endpoint of 95% confidence interval
	public double confidenceLo()
	{
		return 1;
	}
	
	// high endpoint of 95% confidence interval
	public double confidenceHi()
	{
		return 1;
	}
	
	// test client (described below)
	public static void main (String[] args)
	{
		//Use StdRandom to generate random numbers; use StdStats to compute the sample mean and sample standard deviation.


	}
}
