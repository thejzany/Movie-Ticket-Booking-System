package com.jsp.ticketbookingsystem;

public class Ticket {
	private String movie_name;
	private int no_of_tickets;
	
	public Ticket(String mn, int nt) {
		this.movie_name=mn;
		this.no_of_tickets=nt;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name){
		this.movie_name = movie_name;
	}

	public int getNo_of_tickets(){
		return no_of_tickets;
	}

	public void setNo_of_tickets(int no_of_tickets){
		this.no_of_tickets = no_of_tickets;
	}
  
	public void printTicketDetails() {
		System.out.println("===========YOUR TICKET DETAILS=======");
		System.out.println("Movie name is  "+movie_name);
		System.out.println("Tickets booked are "+no_of_tickets);
		
	}		
}
