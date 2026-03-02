package multi_threading.practice_Section;

public class BankProject_usingThread {

	public static void main(String[] args) {

	}
}

class TicketsCounter {
	private int availabelTickets;

	public TicketsCounter(int tickets) {
		this.availabelTickets = tickets;
	}

	public void BookingTickets(String User_Name, int Ticket_Requested) {

		System.out.println(User_Name + " Trying To Booking " + Ticket_Requested +"Tickets.");
		
	}
}