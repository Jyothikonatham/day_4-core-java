public class Order{	
	public String getOrderDetails(String restaurantName,String foodItem,int quantity){
		return "Restaurant Name :" + restaurantName + "\nFood Item :" + foodItem +"\nQuantuty :" + quantity;
	}
	public static void main(String[] args){
		Order ord = new Order();
		String det = ord.getOrderDetails("Spice Garden","Paneer Butter Masala",2);
		System.out.println(det);
		String det1 = ord.getOrderDetails("Spice Garden","Chicken Biriyani",1);
		System.out.println(det1);
	}
}