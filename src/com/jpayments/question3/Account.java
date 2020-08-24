package com.jpayments.question3;

public class Account implements OnlineAccount,Comparable<Account> {

	 
	protected Integer noOfRegularMovies;
	protected Integer noOfExclusiveMovies;
	protected String ownerName;
	
	public Account( Integer noOfRegularMovies, Integer noOfExclusiveMovies, String owerName) {
		setNoOfRegularMovies(noOfRegularMovies);
		setNoOfExclusiveMovies(noOfExclusiveMovies);
		setOwnerName(owerName); 
	}

	public Integer getNoOfRegularMovies() {
		return noOfRegularMovies;
	}

	public void setNoOfRegularMovies(Integer noOfRegularMovies) {
		this.noOfRegularMovies = noOfRegularMovies;
	}

	public Integer getNoOfExclusiveMovies() {
		return noOfExclusiveMovies;
	}

	public void setNoOfExclusiveMovies(Integer noOfExclusiveMovies) {
		this.noOfExclusiveMovies = noOfExclusiveMovies;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double monthlyCost() {
	
		return ( basePrice() + (this.noOfRegularMovies * regularMoviePrice()) + (this.noOfExclusiveMovies * exclusiveMoviePrice())) ;
		
	}
	
	@Override
	public double basePrice() {
		return 755;
		
	}

	@Override
	public double regularMoviePrice() {
		return 18.75;
	}

	@Override
	public double exclusiveMoviePrice() {
		return 56.25;
	}
	
	public String toString() {
		return "Owner is " +ownerName+" and monthly cost is "+this.monthlyCost()+" USD.";
	}

	@Override
	public int compareTo(Account o) {
		return this.monthlyCost() < o.monthlyCost() ? +1 : (this.monthlyCost() > o.monthlyCost() ? -1 : 0);
	}

}
