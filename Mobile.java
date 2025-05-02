public class Mobile{
	public String showDetails(String storeName,String brand,int price){
		return "Store Name :" + storeName + "\nMobile Brand :" + brand + "\nMobile Price :" + price;
	}
	public static void main(String[] args){
		Mobile mob = new Mobile();
		String details = mob.showDetails("Tech World","Apple",1200);
		System.out.println(details);
		String detail = mob.showDetails("Tech World","Samsung",900);
		System.out.println(detail);
	}
}