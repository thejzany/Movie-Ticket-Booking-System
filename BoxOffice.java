package com.jsp.ticketbookingsystem;
import java.util.Scanner;

public class BoxOffice {
  public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    Theatre	theatre = new Theatre("PVR", 300);
    
    boolean Flag=true;
    
    while(Flag) {
    	System.out.println(" \nEnter \n1. Show Seat Availability. \n2. Book Tickets. \n3. Check Ticket Details. \n4. Cancel Tickets. \n5. Exit.");
    	int n=sc.nextInt();
    	switch(n) {
    	case 1 :{
    		theatre.showSeatAvaliability();
    	}break;
    	
    	
    	case 2 :{
    		System.out.println("Enter the Movie Name: ");
    		String name=sc.next();
    		System.out.println("Enter the number of seats you want to book");
    		int num=sc.nextInt();
    		theatre.setTicket(new Ticket(name, num));
    		int booked=theatre.bookTickets();
    		if(booked==-1) {
    			System.out.println("Sorry, the number of seats you trying to book are not avaliable");
    		}else {
    			System.out.println("Hurray! tickets booked successfully. Enjoy the movie");
  		}	
    	}break;
    	
    	
    	case 3 :{
    		theatre.showTicketDetails();
    	}break;
    	
    	
    	case 4 :{
    		System.out.println("Enter the number of tickets to be cancalled");
    		int cancel=sc.nextInt();
    		theatre.cancelTickets(cancel);
    	}break;
    
    	case 5 :{
    		System.out.println("Thank you for using our Ticket Booking System!");
    		Flag=false;
    	}break;
    	default :{
    		System.out.println("Invalid choice");
      }
     }
    }
   }
  }
