public class Reservation{
	public String getReservationDetails(String hotelName,String guestName,int nights){
		return "Hotel Name :" + hotelName + "\nGuest Name :" + guestName + "\nNights :" + nights;
	}
	public static void main(String[] args){
		Reservation res = new Reservation();
		String det = res.getReservationDetails("Grand Palace","David",3);
		System.out.println(det);
		String det1 = res.getReservationDetails("Grand Palace","Maria",2);
		System.out.println(det1);
	}
}
