package com.bridgelabz.objectorientedprograms;

public class Stock {
	 private String shareName;
	    private int noOfShare;
	    private int sharePrice;
	    public Stock(String shareName, int noOfShare, int sharePrice) {
	        super();
	        this.shareName = shareName;
	        this.noOfShare = noOfShare;
	        this.sharePrice = sharePrice;
	    }
	    public String getShareName() {
	        return shareName;
	    }
	    public int getNoOfShare() {
	        return noOfShare;
	    }
	    public int getSharePrice() {
	        return sharePrice;
	    }
	    @Override
	    public String toString() {
	        return "Stock [shareName=" +shareName + ", noOfShare=" + noOfShare + ", sharePrice=" + sharePrice + "]";
	    }

	}