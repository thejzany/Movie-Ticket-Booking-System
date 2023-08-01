package com.jsp.ticketbookingsystem;

public class Theatre {
	private String theatre_name;
	private int no_of_seats;
    
	private Ticket ticket;
	
	public Theatre(String tn, int ns){
		this.theatre_name = tn;
		this.no_of_seats= ns;
	}

	public String getTheatre_name() {
		return theatre_name;
	}

	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}

	public Ticket getTicket() {
		return ticket;
	}
	
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public int bookTickets() {
		if(ticket.getNo_of_tickets()<=no_of_seats) {
		no_of_seats=no_of_seats-ticket.getNo_of_tickets();
		return ticket.getNo_of_tickets();
		}else {
			return -1;
		}
	}

	public void showSeatAvaliability(){
	    if(no_of_seats>0) {
		System.out.println(no_of_seats+" seats are avaliable");
	    }else{
	    	System.out.println("Sorry, the theatre is houseful. All tickets have been sold out");
	    }
	}
	
	public void cancelTickets(int cancel_tickets) {
		if(ticket==null) {
			System.out.println("Kindly, book tickets first.");
		}else {
			if(cancel_tickets<=ticket.getNo_of_tickets()) {
				no_of_seats=no_of_seats+cancel_tickets;
				ticket.setNo_of_tickets(ticket.getNo_of_tickets()-cancel_tickets);
				System.out.println("Tickets cancelled successfully");
			}else {
				System.out.println("Error: The number of tickets to be canceled exceeds the number of tickets booked. Please review your cancellation request and ensure it does not exceed the total number of booked tickets.");
			}
			
		}
	}
	
	public void showTicketDetails() {
		if(ticket==null ) {
			System.out.println("Please book ticket first");
			}else {
				ticket.printTicketDetails();
				}
	}
}
