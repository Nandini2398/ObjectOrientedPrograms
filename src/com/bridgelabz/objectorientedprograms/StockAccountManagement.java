package com.bridgelabz.objectorientedprograms;

public class StockAccountManagement {
		static String shareName;
		static int noOfShare;
		static int sharePrice;
		public Stock(String shareName, int noOfShare, int sharePrice) {
			super();
			this.sharePrice = sharePrice;
			this.shareName = shareName;
			this.noOfShare = noOfShare;
		}
		public String toString() {
			return "Stock [shareName=" +shareName + ", noOfShare=" + noOfShare + ", sharePrice=" + sharePrice + "]";
		}
	}