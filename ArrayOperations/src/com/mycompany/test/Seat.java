package com.mycompany.test;


		
public class Seat implements Comparable<Seat> {

	private final String seatNumber;
	private boolean reserved = false;

	public Seat(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean reserve() {
		if (!this.reserved) {
			this.reserved = true;
			System.out.println(" Seat " + seatNumber + " reserved ");
			return true;
		} else {
			return false;
		}
	}
	public boolean cancel() {
		
		if(this.reserved) {
			this.reserved=false;
			System.out.println("The requested seat "+seatNumber +"is cancelled");
			return true;
		}else {
		return false;
	}
	}
	
	public String getSeatNumber() {
		
		return seatNumber;
	}

	@Override
	public int compareTo(Seat seat) {
		
		return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
	}
}
	
	
	

