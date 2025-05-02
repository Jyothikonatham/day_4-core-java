public class Ticket{
	public String getTicketInfo(String theaterName,String movieName,String seatNo){
		return "Theater Name :" + theaterName + "\nMovie Name :" + movieName + "\nSeat No :" + seatNo;
	}
	public static void main(String[] args){
		Ticket tic = new Ticket();
		String det =  tic.getTicketInfo("Galaxy Cinemas","Interstellar","A10");
		System.out.println(det);
		String deta =  tic.getTicketInfo("Galaxy Cinemas","Inception","B12");
		System.out.println(deta);
	}
}
		