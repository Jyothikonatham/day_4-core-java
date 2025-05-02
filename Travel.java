public class Travel{
	public String getBookingDetails(String agency,String destination,int travelers){
		return "Agency :" + agency +"\nDestination :" + destination + "\nTravellers :" + travelers;
	}
	public static void main(String[] args){
		Travel travel = new Travel();
		String det = travel.getBookingDetails("Wanderlust Travels","Paris",2);
		System.out.println(det);
		String det1 = travel.getBookingDetails("Wanderlust Travels","Tokyo",3);
		System.out.println(det1);
	}
}
